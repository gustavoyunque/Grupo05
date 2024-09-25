package pweb;
public class HTMLGenerator {

 
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

   
    public String createLink() {
        String url = "https://github.com/gustavoyunque/Grupo05";
        String text = "Este es el enlace a nuestro repositorio GitHub";
        return "<a href=\"" + url + "\">" + text + "</a>";
    }

   
    public String createList(boolean ordered) {
        String[] items = {
            "Paso 1: Clonar el repositorio",
            "Paso 2: Crear tu propia rama",
            "Paso 3: Implementar tu parte del código",
            "Paso 4: Hacer pull request para unir los cambios"
        };
        StringBuilder list = new StringBuilder();
        list.append(ordered ? "<ol>" : "<ul>");
        for (String item : items) {
            list.append("<li>").append(item).append("</li>");
        }
        list.append(ordered ? "</ol>" : "</ul>");
        return list.toString();
    }

    
    public static void main(String[] args) {
        HTMLGenerator generator = new HTMLGenerator();
        
      
        System.out.println(generator.createTitle());
        System.out.println(generator.createHeader());
        System.out.println(generator.createParagraph());
        System.out.println(generator.createLink());
        System.out.println(generator.createList(true)); 
    }
}

	

