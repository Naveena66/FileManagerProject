package filedbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class FileManagerDataManagementSystemImpl implements FileManagerDataManagementSystem {
	Scanner scan = new Scanner(System.in);
	LinkedHashMap<String,FileManager> db = new LinkedHashMap<String,FileManager>();

	@Override
	public void storeImages() {
		System.out.println("Enter FileFormat,FileName,FileSize,FilePath:");
		String fileFormat = scan.next();
		double fileSize = scan.nextDouble();
		String fileName = scan.next();
		String filePath = scan.next();
		
		db.put(fileFormat, new FileManager(fileFormat, fileSize, fileName, filePath));
		System.out.println("Image Inserted Successfully");
		
	}
	@Override
	public void showImages() {
		Set<String> setOfKeys = db.keySet();
		for(String fileFormat : setOfKeys) { 
			FileManager fm = db.get(fileFormat);
			System.out.println("FileFormat: "+fm.getFileFormat()+"\nFileName: "+fm.getFileName()+"\nFileSize: "+fm.getFileSize()+"\nFilePath: "+fm.getFilePath()); 
		}
	}

	@Override
	public void countImages() {
		System.out.println("Number Of Images: "+db.size());
		
	}

	@Override
	public void sortImages() {
		ArrayList<FileManager> l = new ArrayList<FileManager>();
		Set<String> fm = db.keySet();
		for(String fileFormat : fm) {
			l.add(db.get(fileFormat));
		}
		
		System.out.println("1:Sort Based On FileFormat\n2:Sort Based On FileName\n3:Sort Based On FileSize\n4:Sort Based On FilePath");
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			Collections.sort(l, new SortFileManagerByImagesByFileFormat());
			displayImages(l);
			break;
		case 2:
			Collections.sort(l, new SortFileManagerByImagesByFileName());
			displayImages(l);
			break;
		case 3:
			Collections.sort(l, new SortFileManagerByImagesByFileSize());
			displayImages(l);
			break;
		case 4:
			Collections.sort(l, new SortFileManagerByImagesByFilePath());
			displayImages(l);
			break;
		default:
			System.out.println("Invalid choice,Enter valid choice");
		}		
	}
	private void displayImages(ArrayList<FileManager> l) {
		for(FileManager f1 : l) {
			System.out.println(f1);
		}
		
	}
	
	@Override
	public void deleteImages() {
		System.out.println("Enter File Format:");
		String fileFormat = scan.next();
		
		if(db.containsKey(fileFormat)) {
			db.remove(fileFormat);
		}
		else {
			try {
			throw new FileNotFoundException("File Not Found");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		  }
	   }
		
	}

	@Override
	public void deleteAllImages() {
		db.clear();
		System.out.println("All Images Deleted");
		
	}

	@Override
	public void storeVideos() { 
		System.out.println("Enter FileFormat,FileName,FileSize,FilePath:");
		String fileFormat = scan.next();
		double fileSize = scan.nextDouble();
		String fileName = scan.next();
		String filePath = scan.next();
		
		db.put(fileFormat, new FileManager(fileFormat, fileSize, fileName, filePath));
		System.out.println("Video Inserted Successfully");
		
	}
	
	@Override
	public void showVideos() {
		Set<String> setOfKeys = db.keySet();
		for(String fileFormat : setOfKeys) { 
			FileManager fm = db.get(fileFormat);
			System.out.println("FileFormat: "+fm.getFileFormat()+"\nFileName: "+fm.getFileName()+"\nFileSize: "+fm.getFileSize()+"\nFilePath: "+fm.getFilePath()); 
		}
		
	}

	@Override
	public void countVideos() {
		System.out.println("Number Of Videos: "+db.size());
		
	}

	@Override
	public void sortVideos() {
		ArrayList<FileManager> l = new ArrayList<FileManager>();
		Set<String> fm = db.keySet();
		for(String fileFormat : fm) {
			l.add(db.get(fileFormat));
		}
		
		System.out.println("1:Sort Based On FileFormat\n2:Sort Based On FileName\n3:Sort Based On FileSize\n4:Sort Based On FilePath");
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			Collections.sort(l, new SortFileManagerByVideosByFileFormat());
			displayVideos(l);
			break;
		case 2:
			Collections.sort(l, new SortFileManagerByVideosByFileName());
			displayVideos(l);
			break;
		case 3:
			Collections.sort(l, new SortFileManagerByVideosByFileSize());
			displayVideos(l);
			break;
		case 4:
			Collections.sort(l, new SortFileManagerByVideosByFilePath());
			displayVideos(l);
			break;
		default:
			System.out.println("Invalid choice,Enter valid choice");
		}
		
	}
	private static void displayVideos(ArrayList<FileManager> l) {
		for(FileManager f2 : l) {
			System.out.println(f2);
		}
	}

	@Override
	public void deleteVideos() {
		System.out.println("Enter File Format:");
		String fileFormat = scan.next();
		
		if(db.containsKey(fileFormat)) {
			db.remove(fileFormat);
		}
		else {
			try {
			throw new FileNotFoundException("File Not Found");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		  }
	   }
		
	}

	@Override
	public void deleteAllVideos() {
		db.clear();
		System.out.println("All Videos Deleted");
		
	}


	@Override
	public void storeAudios() {
		System.out.println("Enter FileFormat,FileName,FileSize,FilePath:");
		String fileFormat = scan.next();
		double fileSize = scan.nextDouble();
		String fileName = scan.next();
		String filePath = scan.next();
		
		db.put(fileFormat, new FileManager(fileFormat, fileSize, fileName, filePath));
		System.out.println("Audio Inserted Successfully");
				
	}
	
	@Override
	public void showAudios() {
		Set<String> setOfKeys = db.keySet();
		for(String fileFormat : setOfKeys) { 
			FileManager fm = db.get(fileFormat);
			System.out.println("FileFormat: "+fm.getFileFormat()+"\nFileName: "+fm.getFileName()+"\nFileSize: "+fm.getFileSize()+"\nFilePath: "+fm.getFilePath()); 
		}
		
	}

	@Override
	public void countAudios() {
		System.out.println("Number Of Audios: "+db.size());
		
	}

	@Override
	public void sortAudios() {
		ArrayList<FileManager> l = new ArrayList<FileManager>();
		Set<String> fm = db.keySet();
		for(String fileFormat : fm) {
			l.add(db.get(fileFormat));
		}
		
		System.out.println("1:Sort Based On FileFormat\n2:Sort Based On FileName\n3:Sort Based On FileSize\n4:Sort Based On FilePath");
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			Collections.sort(l, new SortFileManagerByAudiosByFileFormat());
			displayAudios(l);
			break;
		case 2:
			Collections.sort(l, new SortFileManagerByAudiosByFileName());
			displayAudios(l);
			break;
		case 3:
			Collections.sort(l, new SortFileManagerByAudiosByFileSize());
			displayAudios(l);
			break;
		case 4:
			Collections.sort(l, new SortFileManagerByAudiosByFilePath());
			displayAudios(l);
			break;
		default:
			System.out.println("Invalid choice,Enter valid choice");
		}		
	}
	private static void displayAudios(ArrayList<FileManager> l) {
		for(FileManager f3 : l) {
			System.out.println(f3);
		}
	}

	@Override
	public void deleteAudios() {
		System.out.println("Enter File Format:");
		String fileFormat = scan.next();
		
		if(db.containsKey(fileFormat)) {
			db.remove(fileFormat);
		}
		else {
			try {
			throw new FileNotFoundException("File Not Found");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		  }
	   }
		
	}

	@Override
	public void deleteAllAudios() {
		db.clear();
		System.out.println("All Audios Deleted");
		
	}

	@Override
	public void storeDocuments() {
		System.out.println("Enter FileFormat,FileName,FileSize,FilePath:");
		String fileFormat = scan.next();
		double fileSize = scan.nextDouble();
		String fileName = scan.next();
		String filePath = scan.next();
		
		db.put(fileFormat, new FileManager(fileFormat, fileSize, fileName, filePath));
		System.out.println("Document Inserted Successfully");
		
		
	}
	
	@Override
	public void showDocuments() {
		Set<String> setOfKeys = db.keySet();
		for(String fileFormat : setOfKeys) { 
			FileManager fm = db.get(fileFormat);
			System.out.println("FileFormat: "+fm.getFileFormat()+"\nFileName: "+fm.getFileName()+"\nFileSize: "+fm.getFileSize()+"\nFilePath: "+fm.getFilePath()); 
		}
	}

	@Override
	public void countDocuments() {
		System.out.println("Number Of Documents: "+db.size());
		
	}

	@Override
	public void sortDocuments() {
		ArrayList<FileManager> l = new ArrayList<FileManager>();
		Set<String> fm = db.keySet();
		for(String fileFormat : fm) {
			l.add(db.get(fileFormat));
		}
		
		System.out.println("1:Sort Based On FileFormat\n2:Sort Based On FileName\n3:Sort Based On FileSize\n4:Sort Based On FilePath");
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			Collections.sort(l, new SortFileManagerByDocumentsByFileFormat());
			displayDocuments(l);
			break;
		case 2:
			Collections.sort(l, new SortFileManagerByDocumentsByFileName());
			displayDocuments(l);
			break;
		case 3:
			Collections.sort(l, new SortFileManagerByDocumentsByFileSize());
			displayDocuments(l);
			break;
		case 4:
			Collections.sort(l, new SortFileManagerByDocumentsByFilePath());
			displayDocuments(l);
			break;
		default:
			System.out.println("Invalid choice,Enter valid choice");
		}		
	}
	private static void displayDocuments(ArrayList<FileManager> l) {
		for(FileManager f4 : l) {
			System.out.println(f4);
		}
	}

	@Override
	public void deleteDocuments() {
		System.out.println("Enter File Format:");
		String fileFormat = scan.next();
		
		if(db.containsKey(fileFormat)) {
			db.remove(fileFormat);
		}
		else {
			try {
			throw new FileNotFoundException("File Not Found");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		  }
	   }
	
		
	}

	@Override
	public void deleteAllDocuments() {
		db.clear();
		System.out.println("All Documents Deleted");
		
	}

	@Override
	public void storeZipFiles() {
		System.out.println("Enter FileFormat,FileName,FileSize,FilePath:");
		String fileFormat = scan.next();
		double fileSize = scan.nextDouble();
		String fileName = scan.next();
		String filePath = scan.next();
		
		db.put(fileFormat, new FileManager(fileFormat, fileSize, fileName, filePath));
		System.out.println("ZipFile Inserted Successfully");
		
	}
	@Override
	public void showZipFiles() {
		Set<String> setOfKeys = db.keySet();
		for(String fileFormat : setOfKeys) { 
			FileManager fm = db.get(fileFormat);
			System.out.println("FileFormat: "+fm.getFileFormat()+"\nFileName: "+fm.getFileName()+"\nFileSize: "+fm.getFileSize()+"\nFilePath: "+fm.getFilePath()); 
		}
	}

	@Override
	public void countZipFiles() {
		System.out.println("Number Of ZipFiles: "+db.size());
		
	}

	@Override
	public void sortZipFiles() {
		ArrayList<FileManager> l = new ArrayList<FileManager>();
		Set<String> fm = db.keySet();
		for(String fileFormat : fm) {
			l.add(db.get(fileFormat));
		}
		
		System.out.println("1:Sort Based On FileFormat\n2:Sort Based On FileName\n3:Sort Based On FileSize\n4:Sort Based On FilePath");
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			Collections.sort(l, new SortFileManagerByZipFilesByFileFormat());
			displayZipFiles(l);
			break;
		case 2:
			Collections.sort(l, new SortFileManagerByZipFilesByFileName());
			displayZipFiles(l);
			break;
		case 3:
			Collections.sort(l, new SortFileManagerByZipFilesByFileSize());
			displayZipFiles(l);
			break;
		case 4:
			Collections.sort(l, new SortFileManagerByZipFilesByFilePath());
			displayZipFiles(l);
			break;
		default:
			System.out.println("Invalid choice,Enter valid choice");
		}		
		
	}
	private static void displayZipFiles(ArrayList<FileManager> l) {
		for(FileManager f5 : l) {
			System.out.println(f5);
		}
	}

	@Override
	public void deleteZipFiles() {
		System.out.println("Enter File Format:");
		String fileFormat = scan.next();
		
		if(db.containsKey(fileFormat)) {
			db.remove(fileFormat);
		}
		else {
			try {
			throw new FileNotFoundException("File Not Found");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		  }
	   }
		
	}

	@Override
	public void deleteAllZipFiles() {
		db.clear();
		System.out.println("All ZipFiles Deleted");
	
		
	}	
	
	@Override
	public void storeApps() {
		System.out.println("Enter FileFormat,FileName,FileSize,FilePath:");
		String fileFormat = scan.next();
		double fileSize = scan.nextDouble();
		String fileName = scan.next();
		String filePath = scan.next();
		
		db.put(fileFormat, new FileManager(fileFormat, fileSize, fileName, filePath));
		System.out.println("App Inserted Successfully");
		
	}
	@Override
	public void showApps() {
		Set<String> setOfKeys = db.keySet();
		for(String fileFormat : setOfKeys) { 
			FileManager fm = db.get(fileFormat);
			System.out.println("FileFormat: "+fm.getFileFormat()+"\nFileName: "+fm.getFileName()+"\nFileSize: "+fm.getFileSize()+"\nFilePath: "+fm.getFilePath()); 
		}
		
		
	}

	@Override
	public void countApps() {
		System.out.println("Number Of Apps: "+db.size());
	
	}

	@Override
	public void sortApps() {
		ArrayList<FileManager> l = new ArrayList<FileManager>();
		Set<String> fm = db.keySet();
		for(String fileFormat : fm) {
			l.add(db.get(fileFormat));
		}
		
		System.out.println("1:Sort Based On FileFormat\n2:Sort Based On FileName\n3:Sort Based On FileSize\n4:Sort Based On FilePath");
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			Collections.sort(l, new SortFileManagerByAppsByFileFormat());
			displayApps(l);
			break;
		case 2:
			Collections.sort(l, new SortFileManagerByAppsByFileName());
			displayApps(l);
			break;
		case 3:
			Collections.sort(l, new SortFileManagerByAppsByFileSize());
			displayApps(l);
			break;
		case 4:
			Collections.sort(l, new SortFileManagerByAppsByFilePath());
			displayApps(l);
			break;
		default:
			System.out.println("Invalid choice,Enter valid choice");
		}			
	}
	private static void displayApps(ArrayList<FileManager> l) {
		for(FileManager f6 : l) {
			System.out.println(f6);
		}
	}

	@Override
	public void deleteApps() {
		System.out.println("Enter File Format:");
		String fileFormat = scan.next();
		
		if(db.containsKey(fileFormat)) {
			db.remove(fileFormat);
		}
		else {
			try {
			throw new FileNotFoundException("File Not Found");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		  }
	   }
		
	}

	@Override
	public void deleteAllApps() {
		db.clear();
		System.out.println("All Apps Deleted");
		
	}
	@Override
	public void sortFiles() {
		ArrayList<FileManager> l = new ArrayList<FileManager>();
		Set<String> fm = db.keySet();
		for(String fileFormat : fm) {
			l.add(db.get(fileFormat));
		}
		Collections.sort(l, new SortFileManagerByFiles());
		for(FileManager f : l) {
			System.out.println(f);
		}
		
	}
	

}

