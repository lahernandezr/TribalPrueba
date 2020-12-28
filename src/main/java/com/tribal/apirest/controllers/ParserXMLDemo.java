package com.tribal.apirest.controllers;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


public class ParserXMLDemo {
        /**
    * Función que parsea un documento XML para su manipulación
    * @param filePath ruta del archivo XML
    */ 
    public Document paserXML(String data){

        if(data.equals(""))
        {
            System.out.println("No hay información.");
            return null;
        }
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(data));
            Document doc = dBuilder.parse(is);
            doc.getDocumentElement().normalize();
            return doc;
         } catch (Exception e) {
            e.printStackTrace();
         }
         return null;
    } 
        /**
    Función busca los nodos en base la etiqueta en un documento parse XML
    @param doc Documento parse XML
    @param name Nombre del tagName a buscar
    */ 
    public NodeList searchList(Document doc, String name){
        if(doc == null)
            return null;           
        NodeList nList = doc.getElementsByTagName(name);
        if(nList == null)
            return null;           
        NodeList listDetalles = nList.item(0).getChildNodes();
        return listDetalles;
    }

    /**
    Función busca una etiqueta en un documento parse XML
    @param doc Documento parse XML
    @param name Nombre del tagName a buscar
    */ 
    public String searchData(Document doc, String name){
        if(doc == null)
            return "";     
        NodeList nList = doc.getElementsByTagName(name);
        String value ="";
        for (int temp = 0; temp < nList.getLength(); temp++) {
           Node nNode = nList.item(temp);
           value = nNode.getTextContent();
        }
        return value;
    }
}
