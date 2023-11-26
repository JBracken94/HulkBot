package bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.AnnotatedEventManager;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.jetbrains.annotations.NotNull;
import net.dv8tion.jda.api.*;

import javax.security.auth.login.LoginException;
import java.io.FileNotFoundException;
import java.util.Random;

/*
 * **Discord bot Tutorial by Kody Simpson on YouTube**
 *
 * https://www.youtube.com/watch?v=LFsxkWME7M0
 * https://www.youtube.com/watch?v=Jk6TQTcJ_F4
 *
 * */
public class BrotherBot extends ListenerAdapter {
    final QuoteGen quoteGen = new QuoteGen();
    static TokenGen tg;
    public static void main(String[] args) throws FileNotFoundException { // Token stored locally, will not function without injecting
        tg = new TokenGen();
        JDABuilder jdaBuilder = JDABuilder.createDefault(tg.getKey()); // Login with token
        jdaBuilder.setActivity(Activity.playing("for the tile belt, brother")); // Sets status on discord sidebar/profile
        jdaBuilder.addEventListeners(new BrotherBot());

        jdaBuilder.build();
    }



    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        // Custom username checking

        if (event.getAuthor().getName().equalsIgnoreCase("krebhart")) {
            event.getChannel().sendMessage(event.getAuthor().getName() + ", " + "WE AINT GOING.... BACK TO..... JAKKUUUUUUUUUUUUUUU").queue();
        } else if (event.getAuthor().getName().equalsIgnoreCase("beefingt")) {
            event.getChannel().sendMessage("ERIK HELP I'M TRAPPED IN THE COMPUTER").queue();
        } else if (event.getAuthor().getName().equalsIgnoreCase("wack_0656")) {
            event.getChannel().sendMessage("me when").queue();
        } else if (event.getAuthor().getName().equalsIgnoreCase("melodicm")) {
            event.getChannel().sendMessage("welcome to the real world, brother").queue();
        } else if (event.getAuthor().getName().equalsIgnoreCase("thesqueezer")) {
            event.getChannel().sendMessage("thank you, pickles").queue();

        } else if (!event.getAuthor().isBot() ) { // prevent bot from replying to itself on a loop
            String name = event.getAuthor().getName();
            event.getChannel().sendMessage(quoteGen.getQuote()).queue();
//            event.getChannel().sendMessage(myMessage(event)).queue();
        }

    }

    public static String hellYeah() {
        String yeah = "he'll yeah, ";
        return yeah;
    }

    public String myMessage(@NotNull MessageReceivedEvent event) { // method for testing MESSAGE_CONTENT once permissions are worked out
        if (event.getAuthor().isBot()) {
            String message = "no dice";
            message = event.getMessage().getContentRaw();
            return message;
        }
        return "hulk";
    }
}
