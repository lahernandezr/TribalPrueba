package com.tribal.apirest.controllers;


import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;
import com.tribal.apirest.models.ItunesResponse;
import com.tribal.apirest.models.PersonResponse;
import com.tribal.apirest.models.Response;
import com.tribal.apirest.models.ResponseMazeTv;
import com.tribal.apirest.models.ResponseServices;
import com.tribal.apirest.models.PersonWSDL;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import io.swagger.annotations.ApiOperation;

@RestController
@ApiOperation("Busqueda de información en APIs")
@RequestMapping("/busqueda")
public class Services {


    @ApiOperation("Consulta servicios de itunes/mazetv/wlsdldemo")
    @RequestMapping(value = "/{datos}", method = RequestMethod.GET)
    @CrossOrigin("*")
    public Response<ResponseServices> transactionId(@PathVariable String datos) {
        Response<ResponseServices> response = new Response<ResponseServices>();
        ResponseServices responseServices = new ResponseServices();

        String dataItunes = datos.replaceAll(" ", "+");

        final String uri = "https://itunes.apple.com/search?term=" + dataItunes;
        final String uri2 = "http://api.tvmaze.com/search/shows?q=" + datos;
        final String uri3 = "http://www.crcind.com/csp/samples/SOAP.Demo.cls?soap_method=GetByName&name=" + datos;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        ItunesResponse responseItunes;
        Gson gson = new Gson();
        responseItunes = gson.fromJson(result, ItunesResponse.class);

        RestTemplate restTemplate2 = new RestTemplate();
        String result2 = "{ shows: " + restTemplate2.getForObject(uri2, String.class) + " }";

        ResponseMazeTv reponseShowList;
        reponseShowList = gson.fromJson(result2, ResponseMazeTv.class);

        RestTemplate restTemplate3 = new RestTemplate();
        String result3 = restTemplate3.getForObject(uri3, String.class);
        
  
  
        ParserXMLDemo parseXML = new ParserXMLDemo();
        Document doc = parseXML.paserXML(result3);
        NodeList nodes = parseXML.searchList(doc, "ListByName");



        List<PersonWSDL> persons= new ArrayList<PersonWSDL>();
        for(int x=0;x < nodes.getLength(); x++){
            Node nNode = nodes.item(x);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;   
                System.out.println(nNode.getTextContent());         
                PersonWSDL person = new PersonWSDL();
                person.setId(eElement.getElementsByTagName("ID").item(0).getTextContent().toString());
                person.setName(eElement.getElementsByTagName("Name").item(0).getTextContent().toString());                
                person.setDob(eElement.getElementsByTagName("DOB").item(0).getTextContent().toString());                
                person.setSnn(eElement.getElementsByTagName("SSN").item(0).getTextContent().toString());
                persons.add(person);
            }
        }

        PersonResponse personsResponse = new PersonResponse();
        personsResponse.setPersons(persons);

        response.setCode(200);
        response.setMessage("Itunes:"+responseItunes.getResultCount()+" cancion(es)/album(es)/libros en MazeTV:"+reponseShowList.getShows().size()+ " tvshow(s) en WLSDemo:"+persons.size() +" persona(s)");
        responseServices.setItunesResponse(responseItunes);
        responseServices.setMazeTvResponse(reponseShowList);
        responseServices.setWsldResponse(personsResponse);

        response.setResult(responseServices);        
        return response;
    }   
    


}
