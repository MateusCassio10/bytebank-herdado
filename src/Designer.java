// Gerente é um funcionario, por isso herda os atributos  métodos da classe Funcionario
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("chamando metodo de bonificacao do Designer");
		return 200;

	}

}
