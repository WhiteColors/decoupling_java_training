package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        switch (args[0]) {
            case "-interactive":
                Player player = new HumanPlayer();
                Simulation simulationPlayer = new Simulation(player);
                SecureRandom random = new SecureRandom();
                long randomNumber = random.nextInt(100);
                simulationPlayer.initialize(randomNumber);
                simulationPlayer.loopUntilPlayerSucceed(Long.MAX_VALUE);
                break;
            case "-auto":
                if (args.length == 2) {
                    try {
                        long number = Long.parseLong(args[1]);
                        Player computerPlayer = new ComputerPlayer();
                        Simulation simulationComputer = new Simulation(computerPlayer);
                        simulationComputer.initialize(number);
                        simulationComputer.loopUntilPlayerSucceed(1000);
                    } catch (NumberFormatException e) {
                        System.out.println("The second argument must be an long number");
                    }
                }
                break;
            default:
                System.out.println("Usage: java -jar [ jarFile ] [ -interactive | -auto <number> ]");
                break;
        }
    }
}
