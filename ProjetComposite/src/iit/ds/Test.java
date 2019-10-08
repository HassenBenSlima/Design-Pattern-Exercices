package iit.ds;



public class Test {
	public static void main(String[] args) {
		Directory racine = new Directory("d:\\");
		Directory dir1 = new Directory("tpJava");
		Directory dir2 = new Directory("homeWork");
		File file1 = new File("Hello.java");
		File file2 = new File("Test.java");
		File file3 = new File("devoir.txt");
		racine.add(dir1);
		racine.add(dir2);
		dir1.add(file1);
		dir1.add(file2);
		dir2.add(file3);
		racine.ls();
	}

}
