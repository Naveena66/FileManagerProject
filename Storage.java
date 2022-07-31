package filedbms;

import java.util.Scanner;

public class Storage {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("WELCOME TO FILE MANAGER DBMS");
			System.out.println("============================");
			
			FileManagerDataManagementSystem db = new FileManagerDataManagementSystemImpl();
			
			while(true) {
				System.out.println("1:IMAGES\n2:VIDEOS\n3:AUDIOS\n4:DOCUMENTS\n5:ZIPFILES\n6:APPS\n7:SORTFILES\n8:EXIT");
				System.out.println("Enter a search:");
				
				int search = scan.nextInt();
				switch(search) { 
				
				case 1:
					System.out.println("1:Store\n2:Show\n3:Delete\n4:DeleteAll\n5:Sort");
					int searchByImages =scan.nextInt();
					switch(searchByImages) {
					case 1: 
						db.storeImages();
						break;
					case 2:	
						db.showImages();
						break;
					case 3:
						db.deleteImages();
						break;
					case 4:
						db.deleteAllImages();
						break;
					case 5:
						db.sortImages();
						break;
					default:
						System.out.println("Invalid choice,Enter valid choice");
					}
					break;
				case 2:
					System.out.println("1:Store\n2:Show\n3:Delete\n4:DeleteAll\n5:Sort");
					int searchByVideos =scan.nextInt();
					switch(searchByVideos) {
					case 1: 
						db.storeVideos();
						break;
					case 2:	
						db.showVideos();
						break;
					case 3:
						db.deleteVideos();
						break;
					case 4:
						db.deleteAllVideos();
						break;
					case 5:
						db.sortVideos();
						break;
					default:
						System.out.println("Invalid choice,Enter valid choice");
					}
					break;
				case 3:
					System.out.println("1:Store\n2:Show\n3:Delete\n4:DeleteAll\n5:Sort");
					int searchByAudios =scan.nextInt();
					switch(searchByAudios) {
					case 1: 
						db.storeAudios();
						break;
					case 2:	
						db.showAudios();
						break;
					case 3:
						db.deleteAudios();
						break;
					case 4:
						db.deleteAllAudios();
						break;
					case 5:
						db.sortAudios();
						break;
					default:
						System.out.println("Invalid choice,Enter valid choice");
					}
					break;
				case 4:
					System.out.println("1:Store\n2:Show\n3:Delete\n4:DeleteAll\n5:Sort");
					int searchByDocuments =scan.nextInt();
					switch(searchByDocuments) {
					case 1: 
						db.storeDocuments();
						break;
					case 2:	
						db.showDocuments();
						break;
					case 3:
						db.deleteDocuments();
						break;
					case 4:
						db.deleteAllDocuments();
						break;
					case 5:
						db.sortDocuments();
						break;
					default:
						System.out.println("Invalid choice,Enter valid choice");
					}
					break;
				case 5:
					System.out.println("1:Store\n2:Show\n3:Delete\n4:DeleteAll\n5:Sort");
					int searchByZipFiles =scan.nextInt();
					switch(searchByZipFiles) {
					case 1: 
						db.storeZipFiles();
						break;
					case 2:	
						db.showZipFiles();
						break;
					case 3:
						db.deleteZipFiles();
						break;
					case 4:
						db.deleteAllZipFiles();
						break;
					case 5:
						db.sortZipFiles();
						break;
					default:
						System.out.println("Invalid choice,Enter valid choice");
					}
					break;
				case 6:
					System.out.println("1:Store\n2:Show\n3:Delete\n4:DeleteAll\n5:Sort");
					int searchByApps =scan.nextInt();
					switch(searchByApps) {
					case 1: 
						db.storeApps();
						break; 
					case 2:	
						db.showApps();
						break;
					case 3:
						db.deleteApps();
						break;
					case 4:
						db.deleteAllApps();
						break;
					case 5:
						db.sortApps();
						break;
					default:
						System.out.println("Invalid choice,Enter valid choice");
					}
					break;
				case 7:
					db.sortFiles();
					break;
				case 8:
					System.out.println("THANK YOU!!");
					System.exit(0);
				default:
					System.out.println("Invalid Search,Kindly Enter Valid Search");
				}
				System.out.println("-------------------------------");
			}
		}
		
	}

}
