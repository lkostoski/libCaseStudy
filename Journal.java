public class Journal extends Title{
	private String editor;

	public String getEditor() {
		return this.editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
    Journal(int id, String title, String editor){
		super(id, title);
        this.editor = editor;
	}
    
    public String toString(){
		return super.toString() + ", editor = " + editor;
	}
}