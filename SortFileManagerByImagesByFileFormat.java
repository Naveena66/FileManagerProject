package filedbms;

import java.util.Comparator;

class SortFileManagerByImagesByFileFormat implements Comparator<FileManager> {
	
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileFormat().compareTo(y.getFileFormat());
	}

}

class SortFileManagerByImagesByFileName implements Comparator<FileManager> {
	
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileName().compareTo(y.getFileName());
	}

}

class SortFileManagerByImagesByFileSize implements Comparator<FileManager> {
	
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileSize().compareTo(y.getFileSize());
	}

}

class SortFileManagerByImagesByFilePath implements Comparator<FileManager> {
	
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFilePath().compareTo(y.getFilePath());
	}

}

class SortFileManagerByVideosByFileFormat implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileFormat().compareTo(y.getFileFormat());
	}
	
}

class SortFileManagerByVideosByFileName implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileName().compareTo(y.getFileName());
	}
	
}

class SortFileManagerByVideosByFileSize implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileSize().compareTo(y.getFileSize());
	}
	
}

class SortFileManagerByVideosByFilePath implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFilePath().compareTo(y.getFilePath());
	}
	
}
class SortFileManagerByAudiosByFileFormat implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileFormat().compareTo(y.getFileFormat());
	}
	
}
class SortFileManagerByAudiosByFileName implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileName().compareTo(y.getFileName());
	}
	
}
class SortFileManagerByAudiosByFileSize implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileSize().compareTo(y.getFileSize());
	}
	
}
class SortFileManagerByAudiosByFilePath implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFilePath().compareTo(y.getFilePath());
	}
	
}
class SortFileManagerByDocumentsByFileFormat implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileFormat().compareTo(y.getFileFormat());
	}
	
}
class SortFileManagerByDocumentsByFileName implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileName().compareTo(y.getFileName());
	}
	
}
class SortFileManagerByDocumentsByFileSize implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileSize().compareTo(y.getFileSize());
	}
	
}
class SortFileManagerByDocumentsByFilePath implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFilePath().compareTo(y.getFilePath());
	}
	
}
class SortFileManagerByZipFilesByFileFormat implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileFormat().compareTo(y.getFileFormat());
	}
	
}
class SortFileManagerByZipFilesByFileName implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileName().compareTo(y.getFileName());
	}
	
}
class SortFileManagerByZipFilesByFileSize implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileSize().compareTo(y.getFileSize());
	}
	
}
class SortFileManagerByZipFilesByFilePath implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFilePath().compareTo(y.getFilePath());
	}
	
}
class SortFileManagerByAppsByFileFormat implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileFormat().compareTo(y.getFileFormat());
	}
	
}
class SortFileManagerByAppsByFileName implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileName().compareTo(y.getFileName());
	}
	
}
class SortFileManagerByAppsByFileSize implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileSize().compareTo(y.getFileSize());
	}
	
}
class SortFileManagerByAppsByFilePath implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFilePath().compareTo(y.getFilePath());
	}
	
}
class SortFileManagerByFiles implements Comparator<FileManager> {
	@Override
	public int compare(FileManager x, FileManager y) {
		return x.getFileFormat().compareTo(y.getFileFormat());
	}
}