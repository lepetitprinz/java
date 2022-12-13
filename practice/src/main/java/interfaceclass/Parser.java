package interfaceclass;


interface Parseable {
    public abstract void parse(String fileName);
}

class ParserManager {
    public static Parseable getParser(String type) {
        Parseable p;
        if (type.equals("XML")) {
            p = new XMLParser();
        } else {
            p = new HTMLParser();
        }
        return p;
    }
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed.");
    }
}

public class Parser {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
