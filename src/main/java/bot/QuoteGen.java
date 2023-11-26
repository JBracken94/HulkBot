package bot;

import java.util.Random;

public class QuoteGen {
    private String[] quotes = {"To all my little Hulkamaniacs, say your prayers, take your vitamins and you will never go wrong.",
            "Watcha gonna do when the hulkster runs wild on YOU?", "This is where the power lies!",
            "Whatever happens with wrestling, my family comes first. Wrestling's in my blood, but my family's in my heart",
            "When you’re nWo, you’re nWo for life.",
            "Negativity and Hulkamania – 2 things that don’t go together.",
            "I’m real good with math, with numbers, like my dad was. I’m pretty much dialed in.",
            "I’m the man that made wrestling famous.",
            "I promised each and every Hulkamaniac when I went to that great battlefield in the sky I would bring the WWF title with me.",
            "To be the man, you gotta beat the man.",
            "Hulkamania is not just a catchphrase, it's a way of life.",
            "I'm the biggest, the baddest, and the strongest wrestler that ever lived.",
            "I'm not just a wrestler, I'm an icon. I'm immortal.",
            "In the ring or in life, always give 110%. Leave it all out there."};

    public String getQuote() {
        Random random = new Random();
        int i = random.nextInt(quotes.length);
        return quotes[i];
    }
}
