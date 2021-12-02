package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess=numberToGuess;
    }

    private boolean nextRound() {
        Long number = player.askNextGuess();
        if(number.equals(numberToGuess))
            {
                logger.log("Felicitation Vous avez gagner Age du capitaine : "+numberToGuess);
                return true;
            }
        else
        {
            if (number > numberToGuess) {
                player.respond(false);
            } else
                player.respond(true);
            return false;
        }
    }

    public void loopUntilPlayerSucceed() {
        boolean test=nextRound();
            while(!test )
            {
                test=nextRound();
            }



    }
}
