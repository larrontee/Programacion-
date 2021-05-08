package com.company;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.IllegalFormatCodePointException;

public class RecorridoDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("MenuDesayuno.xml"));
            cantidadDePlatos(doc);
            mostarXML(doc);
            platoMasCaro(doc);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void mostarXML(Document doc){

        Element root=doc.getDocumentElement();
        System.out.println("<"+root.getTagName()+">");
        NodeList nl = doc.getElementsByTagName("food");
        for (int i = 0; i < nl.getLength() ; i++) {
            Node nodo = nl.item(i);
            Element e = (Element) nl.item(i);
            System.out.println("    <"+e.getTagName()+">");

            if (nodo.getNodeType() == Node.ELEMENT_NODE) {

                if (nodo.hasChildNodes()) {


                    NodeList listaInterior = nodo.getChildNodes();

                    for (int j = 0; j < listaInterior.getLength(); j++) {

                        if  (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element eHijo = (Element) listaInterior.item(j);
                            System.out.println("        <"+eHijo.getTagName()+">");
                            System.out.println("            "+eHijo.getTextContent());
                            System.out.println("        </"+eHijo.getTagName()+">");
                        }
                    }
                    System.out.println("    </"+e.getTagName()+">");
                }


            }
        }
    }
    public static void cantidadDePlatos (Document doc){
        NodeList nl= doc.getElementsByTagName("food");
        System.out.println("Este menu tiene "+ nl.getLength()+" platos.");
    }

    public static void platoMasCaro(Document doc){
        Double mayor=0.0;
        String nombreplato = "";
        NodeList nl = doc.getElementsByTagName("food");
        for (int i = 0; i < nl.getLength() ; i++) {
            Node nodo = nl.item(i);
            Element e = (Element) nl.item(i);

            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                if (nodo.hasChildNodes()) {
                    NodeList listaInterior = nodo.getChildNodes();
                    for (int j = 0; j < listaInterior.getLength(); j++) {

                        if (listaInterior.item(j)== listaInterior.item(1)) {
                            if (listaInterior.item(j).getNodeType() == Node.TEXT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                String precio = eHijo.getTextContent();
                                Double precionum = Double.parseDouble(precio);
                                if (precionum>mayor){
                                    mayor=precionum;
                                }
                            }
                            break;
                        }

                    }
                }
            }
        }
        System.out.println("El plato más caro es "+nombreplato+" su precio es "+ mayor+ " $.");
    }
}
