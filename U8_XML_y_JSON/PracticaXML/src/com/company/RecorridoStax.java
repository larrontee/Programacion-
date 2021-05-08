package com.company;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileReader;

public class RecorridoStax {
    public static void main(String[] args) {
        try{
            boolean estar=false;
            int contador=0;
            XMLInputFactory xmlInputFactory=XMLInputFactory.newInstance();
            XMLEventReader xmlReader= xmlInputFactory.createXMLEventReader(new FileReader("MenuDesayuno.xml"));
            Double calorias=0.0;
            while(xmlReader.hasNext()){
                XMLEvent xmlEvent=xmlReader.nextEvent();
                if (xmlEvent.isEndElement()){
                    EndElement endTag = xmlEvent.asEndElement();
                    if (endTag.getName().getLocalPart().equals("food")){
                        contador++;
                    }
                    if (endTag.getName().getLocalPart().equals("calories")){
                        estar=false;
                    }
                } else if(xmlEvent.isStartElement()){
                    StartElement starTag = xmlEvent.asStartElement();
                    if (starTag.getName().getLocalPart().equals("calories")){
                        estar=true;
                    }

                } else if(xmlEvent.isCharacters()){
                    Characters texto=xmlEvent.asCharacters();
                    if (estar){
                        calorias += Double.parseDouble(texto.getData());
                    }
                }


            }
            System.out.println("El menu tiene "+ contador+" platos");
            System.out.println("El menu tiene un totañ de "+ calorias+" calorias");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
