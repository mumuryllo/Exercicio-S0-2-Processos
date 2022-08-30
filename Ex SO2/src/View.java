
public class View {

	public static void main(String[] args) {
       Controller control = new Controller();
       control.listaProcessos();
       control.mataNome("chorme.exe");
       control.mataPid(5536);
	}

}
