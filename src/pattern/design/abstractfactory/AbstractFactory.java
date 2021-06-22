package pattern.design.abstractfactory;

public class AbstractFactory {
	public static void main(String[] args) {
		IRenderUi renderui = new AbstractFactoryCls().getUI(1);
		System.out.println(renderui.renderUI());
	}

	// commit 1
	public void add() {

	}

	// commit 2
	public void subtract() {

	}

	// commit 3
	public void print() {

	}
}
