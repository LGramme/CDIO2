package GameGUI;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class GUI_monopoly {
    private final int ENGLISH = 0, DANSK = 1, RUSSIAN = 2;
    private final int FIELDSIZE = 12, LANGUAGE_LENGTH = 58;
    private int selectedLanguage;
    String[] Lang_ENG = new String[LANGUAGE_LENGTH];

    public GUI_monopoly(int numberOfPlayers, int language){
        selectedLanguage = language;
        initGUI(numberOfPlayers, selectedLanguage);
    }

    public void initGUI(int numberOfPlayers, int language){
        GUI_Field[] fields = new GUI_Field[FIELDSIZE];

        if(language == ENGLISH) {

            //Start
            GUI_Street Start = new GUI_Street();
            Start.setTitle("START");
            Start.setDescription("You start here...");
            fields[0] = Start;

            //The Tower
            GUI_Street Tower = new GUI_Street("Tower", "+250", "You find a treasure of gold and silver!", "+250", Color.lightGray, null);
            fields[1] = Tower;
            //The Crater
            GUI_Street Crater = new GUI_Street("Crater", "-100", "You fall into a crater and must pay for repairs.", "-100", Color.lightGray, null);
            fields[2] = Crater;
            //Palace Gates
            GUI_Street PalaceGates = new GUI_Street("Palace gates", "+100", "You visit the Palace gates.", "+100", Color.lightGray, null);
            fields[3] = PalaceGates;
            //Cold Desert
            GUI_Street coldDesert = new GUI_Street("Cold Desert", "-20", "You enter a surprisingly cold desert. You feed the penguins.", "-20", Color.lightGray, null);
            fields[4] = coldDesert;
            //Walled city
            GUI_Street walledCity = new GUI_Street("Walled city", "+180", "You feel safe behind the city walls.", "+180", Color.lightGray, null);
            fields[5] = walledCity;
            //Monastery
            GUI_Street monastery = new GUI_Street("Monastery", "+0", "An inner peace finds your soul.", "+0", Color.lightGray, null);
            fields[6] = monastery;
            //Black cave
            GUI_Street blackCave = new GUI_Street("Black cave", "-70", "It's really dark, maybe you should light a torch?", "-70", Color.lightGray, null);
            fields[7] = blackCave;
            //Huts in the mountain
            GUI_Street mountainHut = new GUI_Street("Huts in the mountain", "+60", "This is nice I wonder who owns it.", "+60", Color.lightGray, null);
            fields[8] = mountainHut;
            GUI_Street wereWall = new GUI_Street("The Werewall (Werewolf-wall)", "-80", "It's my wonderwall. +1 Free roll", "-80", Color.lightGray, null);
            fields[9] = wereWall;
            GUI_Street thePit = new GUI_Street("The pit", "-50", "Watch your step.", "-50", Color.lightGray, null);
            fields[10] = thePit;
            GUI_Street GoldMine = new GUI_Street("Goldmine", "+650", "You struck gold, run before any dwarves find you!", "+650", Color.lightGray, null);
            fields[11] = GoldMine;

        }
        GUI gui = new GUI(fields, Color.WHITE);
    }
}
