package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        Player player = new HumanPlayer();
        Logger logger = LoggerFactory.getLogger(player.getClass().getSimpleName());
        //logger.log("The number to find is " + randomNumber);
        logger.log("Guess a number between 0 and 100");
        Simulation simulation = new Simulation(player);
        simulation.initialize(randomNumber);
        simulation.loopUntilPlayerSucceed();
    }
}
