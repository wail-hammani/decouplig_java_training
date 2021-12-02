package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Lancher {
    public static void main(String[] args) {

                SecureRandom random = new SecureRandom();
                long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
                Player player = new HumanPlayer();
                Simulation sim = new Simulation(player);
                sim.initialize(randomNumber);
                sim.loopUntilPlayerSucceed();






        }


    }

