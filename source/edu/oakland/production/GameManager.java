package edu.oakland.helper;

import edu.oakland.production.manager.*;
import java.util.*;

public class GamerManager{

public static void main(String[] args) {
// create instance of TTTManager;
TTTManager manager = new TTTManager();
// launch and initialize all TTTgame classes;
manager.launchApp();

manager.chooseSquare();
}


}
