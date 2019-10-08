package iit.ds;

public class File implements AbstractFile {

	private String fName;

	public File(String name) {
		this.fName = name;
	}

	@Override
	public void ls() {
		System.out.println(fName);
	}

}
