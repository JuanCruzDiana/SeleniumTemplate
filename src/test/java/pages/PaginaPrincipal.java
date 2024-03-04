package pages;

public class PaginaPrincipal extends BasePage {

    // Ejemplo de selector
    private String sectionLinkNosotros = "//a[normalize-space()='NOSOTROS']";

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a www.qualis-lab.com
    public void navegateToQualisLab() {
        navigateTo("https://www.qualis-lab.com");
    }

    public void clickOnNosotros() {
        clickElement(sectionLinkNosotros);
    }
}
