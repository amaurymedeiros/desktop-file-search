
public class ResultadoDeBusca {
	
	private String path;
	private String sumario;

	public ResultadoDeBusca(String path, String sumario) {
		this.setPath(path);
		this.setSumario(sumario);
	}
	
	public ResultadoDeBusca(){
		
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public String getSumario() {
		return sumario;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}
	
	@Override
	public String toString() {
		return path;
	}

}
