package main.java.org.javaRush.TicTacToe;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StaxWriter {
    private String configFile;

    public void setFile (String configFile){
        this.configFile = configFile;
    }

    public void saveConfig() throws Exception{
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(configFile));

        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");

        StartDocument startDocument = eventFactory.createStartDocument("windows-1251", "1.0");
        eventWriter.add(startDocument);
        eventWriter.add(end);
        StartElement gamePlayElement = eventFactory.createStartElement("","", "Gameplay");
        eventWriter.add(gamePlayElement);
        eventWriter.add(end);

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.game();

        createPlayer(eventWriter, "Player", ticTacToe.playerOneId, ticTacToe.playerOne, "X");
        createPlayer(eventWriter, "Player", ticTacToe.playerTwoId, ticTacToe.playerTwo, "O");
        eventWriter.add(tab);

        StartElement gameElement = eventFactory.createStartElement("","", "Game");
        eventWriter.add(gameElement);
        eventWriter.add(end);
        int i=1;
        int j=1;
        for (String motion : ticTacToe.gameLog) {
            if (i <= ticTacToe.stepNumber) {
                gameProgress(eventWriter, "Step", Integer.toString(i), Integer.toString(j), motion);
                if (j == 2) j--;
                else {
                    j++;
                }
           i++; }
        }
        eventWriter.add(tab);
        eventWriter.add(eventFactory.createEndElement("", "", "config"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    private void createPlayer (XMLEventWriter eventWriter, String name, String id, String playerName, String symbol) throws XMLStreamException, FileNotFoundException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");

        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);

        Attribute playerId = eventFactory.createAttribute("id", id);
        Attribute player = eventFactory.createAttribute("name", playerName);
        Attribute playerSymbol = eventFactory.createAttribute("symbol", symbol);
        eventWriter.add(playerId);
        eventWriter.add(player);
        eventWriter.add(playerSymbol);

        EndElement eElement = eventFactory.createEndElement("","", name);
        eventWriter.add(eElement);
        eventWriter.add(end);
    }
    public void gameProgress (XMLEventWriter eventWriter,String name, String stepNumber, String playerId, String motion) throws XMLStreamException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");

        StartElement stepElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(tab);
        eventWriter.add(stepElement);

        Attribute stepNumberAttr = eventFactory.createAttribute("num", stepNumber);
        Attribute playerIdAttr = eventFactory.createAttribute("id", playerId);
        eventWriter.add(stepNumberAttr);
        eventWriter.add(playerIdAttr);

        Characters characters = eventFactory.createCharacters(motion);
        eventWriter.add(characters);

        EndElement eElement = eventFactory.createEndElement("","", name);
        eventWriter.add(eElement);
        eventWriter.add(end);
    }
}
