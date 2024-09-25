package pweb;


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

	public String createParagraph() {
        String text = "Nosotros somos el grupo 05 y hemos usado Git para poder hacer pull y push según corresponda. "
                    + "De esta manera podemos tener un mejor control de versiones al momento de hacer proyectos en grupo.";
        return "<p>" + text + "</p>";
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
