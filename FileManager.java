package filedbms;

public class FileManager {
	
	private String fileFormat;
	private Double fileSize;
	private String fileName;
	private String filePath;
	
	
	
	public FileManager(String fileFormat, Double fileSize, String fileName, String filePath) {
		this.fileFormat = fileFormat;
		this.fileSize = fileSize;
		this.fileName = fileName;
		this.filePath = filePath;
	}

	public String getFileFormat() {
		return fileFormat;
	}
	
	public Double getFileSize() {
		return fileSize;
	}
	
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFilePath() {
		return filePath;
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public String toString() {
		
		return "FileFormat: "+fileFormat+"FileName: "+fileName+"FileSize: "+fileSize+"FilePath: "+filePath;
	}
	
	

}
