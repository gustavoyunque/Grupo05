package trabajo;

public class HTMLGenerator {

    //título
	public String createTitle() {
        String title = "Nuestro primer proyecto en GitHub";
        return "<title>" + title + "</title>";
    }

	public String createHeader() {
        String header = "¡Aprender GitHub con amigos es muy divertido!";
        int level = 1; 
        return "<h" + level + ">" + header + "</h" + level + ">";
    }

    //párrafo
    public String createParagraph(String text) {
        return "";
    }

    //(hipervínculo)
    public String createLink(String url, String text) {
        return ""; 
    }

   // list ordenada o no ordenada
    	    public String createList(String[] items, boolean ordered) {
        return ""; 
    }

    // Método principal 
    public static void main(String[] args) {
        
}





}