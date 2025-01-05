package mentocode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class MentoCode {
	public static void main(String[] args) {
		// 예제코드 19-1 read() 메서드를 이용한 파일 읽기

//		//파일을 읽어올 변수 선언 및 초기화
//		int read = 0;
//		
//		//스트림 선언
//		InputStream in = null;
//		try {
//			in = new FileInputStream("my_file.txt");
//			while(true) {
//				//파일 읽기
//				read = in.read();
//				// -1이면 종료
//				if(read == -1) {
//					break;
//				}
//				System.out.println((char)read);
//			}
//		} catch(IOException e) {
//			System.out.println("Error : " + e.getMessage());
//		} finally {
//			
//			
//			try {
//				// 객체가 사용중이라면 닫는다
//				if(in != null) {
//					in.close();
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//	}

		// 예제 19-2 Read(byte[]) 메서드를 이용한 파일 읽기

		// 파일을 읽어올 변수
//		int read = 0;
//		
//		//스트림 선언
//		InputStream in = null;
//		
//		//데이터를 담을 배열 선언
//		byte[] buffer = new byte[5];
//		
//		try {
//			in = new FileInputStream("my_file.txt");
//			while(true) {
//				//파일 읽기
//				//읽어온 데이터는 배열에 담긴다
//				read = in.read(buffer);
//				//-1이면 종료
//				if(read == -1) {
//					break;
//				}
//				System.out.println(new String(buffer, 0, read));
//			}
//		} catch (IOException e) {
//			System.out.println("Error : " + e.getMessage());
//		} finally {
//			
//			
//			try {
//				//객체가 사용 중이면 닫는다.
//				if(in != null) {
//					in.close();
//				}
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-3 1byte씩 출력하기

//		OutputStream out = null;
//		try {
//			out = new FileOutputStream("write.txt", false);
//			out.write('H');
//			out.write('E');
//			out.write('L');
//			out.write('L');
//			out.write('O');
//		
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				//객체가 사용 중이라면 닫는다.
//				if(out != null) {
//					out.close();
//				}
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-4 byte 배열을 이용해 출력하기

//		OutputStream out = null;
//		try {
//			out = new FileOutputStream("write_arrty.txt", false);
//			String str = "hello world";
//			//문장을 바이트 배열로 변환하여 반환
//			byte[] strArray = str.getBytes();
//			out.write(strArray);
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				//객체가 사용 중이라면 닫는다.
//				if(out != null) {
//					out.close();
//				}
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-5 read()와 write()를 이용한 이미지 복사

		// 스트림 선언
//		FileInputStream in = null;
//		FileInputStream out = null;
//		try {
//			in = new FileInputStream("back.jpg");
//			out = new FileInputStream("back_copy.jpg");
//			//현재 시간을 m/s 단위로 나타냄
//			long start = System.currentTimeMillis();
//			System.out.println("이미지 읽기 시작");
//			int read = 0;
//			while((read = in.read()) != -1) {
//				out.write(read);
//			}
//			System.out.println("이미지 읽기 종료");
//			long end = System.currentTimeMillis();
//			long time = (end - start) / 1000;
//			System.err.println(time + "초");
//		} catch(IOException e) {
//			
//			e.printStackTrace();
//		} finally  {
//			try {
//				if(out != null) {
//					out.close();
//				}
//				if(in != null) {
//					in.close();
//				}
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-6 배열을 이용한 이미지 복사

//		FileInputStream in = null;
//		FileInputStream out = null;
//		
//		try {
//			in = new FileInputStream("back.jpg");
//			out = new FileOutputStream("back_copy.jpg");
//			byte[] = buffer = new byte[512];
//			//현재 시간을 m/s 단위로 나타냄
//			long start = System.currentTimeMillis();
//			System.out.println("이미지 읽기 시작");
//			int read = 0;
//			while((read = in.read(buffer)) != -1) {
//				out.write(buffer, 0, read);
//			}
//			System.out.println("이미지 읽기 종료");
//			long end = System.currentTimeMillis();
//			double time = (double)(end - start) / 1000;
//			System.err.println(time + "초");
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(out != null) {
//					out.close();
//				}
//				if(in != null) {
//					in.close();
//				}
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-7

		// 파일을 읽어올 변수
//		int read = 0;
//		//스트림 선언
//		InputStream in = null;
//		
//		try {
//			in = new FileInputStream("file_korean.txt");
//			while(true) {
//				//파일 읽기
//				read = in.read();
//				//-1이면 종료
//				if(read == -1) {
//					break;
//				}
//				System.out.println((char)read);
//			} catch(IOException e) {
//				System.out.println("Error : " + e.getMessage());
//			} finally {
//				
//				try {
//					//객체가 사용 중이면 닫는다.
//					if(if != null) {
//						in.close();
//					}
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}

		// 예제 19-8 FileReader의 read()메서드를 이용한 파일 읽기

		// 파일을 읽어올 변수
//		int read = 0;
//		
//		//스트림 선언
//		Reader reader = null;
//		
//		try {
//			reader = new FileReader("file_korean.txt");
//			while(true) {
//				//파일 읽기
//				read = reader.read();
//				// -1이면 종료
//				if(read == -1) {
//					break;
//				}
//				System.out.println((char)read);
//			}
//		} catch(IOException e) {
//			System.out.println("Error :" + e.getMessage());
//		} finally {
//			
//			try {
//				//객체가 사용중이면 닫는다
//				if(reader != null) {
//					reader.close();
//				}
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-9 read(char[])메서드를 이용한 파일 읽기

		// 파일을 읽어올 변수
//		int read = 0;
//		
//		//스트림 선언
//		Reader in = null;
//		
//		try {
//			in = new FileReader("file_korean.txt");
//			char[] buffer = new char[256];
//			
//			while(true) {
//				//파일 읽기
//				read = in.read(buffer);
//				//-1 이면 종료
//				if(read == -1) {
//					break;
//				}
//				System.out.println(String.valueOf(buffer, 0, read));
//			}
//		} catch(IOException e) {
//			System.out.println("Error :" + e.getMessage());
//		} finally {
//			
//			try {
//				//객체가 사용 중이면 닫는다
//				if(in != null) {
//					in.close();
//				}
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-10 FileWriter 스트림

//		FileeWriter w = null;
//		try {
//			//FileOutputStream처럼 이어쓰기, 덮어쓰기 모드 존재
//			w = new FileWriter("fileText.txt", false);
//			w.write('H');
//			w.write('A');
//			w.write('P');
//			w.write('P');
//			w.write('Y');
//			w.write('\n');
//			System.out.println("파일 생성 완료");
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(w != null) {
//					w.close();
//				}
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-11 BufferedInputStream

		// 보조 스트림 사용
//		FileInputStream in = null;
//		BufferdInputStream bis = null;
//		try {
//			in = new FileInputStream("fileText.txt");
//			bis = new BufferedInputStream(in);
//			int read = 0;
//			
//			//보조 스트림을 사용하면 라인 단위로 읽어올 수 있다
//			while((read = bis.read() != -1){
//				System.out.println((char)read);
//			}
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				//여러 개를 닫을 때는 나중에 선언한 것부터 닫으면 된다
//				if(bis != null) {
//					bis.close();
//					
//				}
//				
//			}if(in != null) {
//				in.close();
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}

		// 예제 19-12 보조 스트림 읽기 성능 테스트
//		
//		FileInputStream readFile = null; //기반 스트림
//		FileInputStream bisReadFile = null; //보조 스트림에 사용할 기반 스트림
//		BufferedInputStream bis = null; //보조 스트림
//		
//		try {
//			System.out.println("기본 스트림으로 읽기 시작");
//			readFile = new FileInputStream("back.jpg");
//			// 현재 시간을 m/s 단위로 나타냄
//			long start = System.currentTimeMillis();
//			System.out.println("이미지 읽기 시작1");
//			while(readFile.read() != -1) {
//				//이미지 읽기
//			}
//			System.out.println("이미지 읽기 종료1");
//			long end = System.currentTimeMillis();
//			long time = (end - start) / 1000;
//			
//			System.out.println("소요 시간 : " + time + "초");
//			System.out.println("기본 스트림으로 읽기 종료");
//			
//			System.out.println("보조 스트림으로 읽기 시작");
//			bisReadFile = new FileInputStream("back.jpg");
//			bis = new BufferedInputStream(bisReadFile);
//			//현재 시간을 m/s 단위로 나타냄
//			start = System.currentTimeMillis();
//			System.out.println("이미지 읽기 시작2");
//			while(bis.read() != -1) {
//				//이미지 읽기
//			}
//						
//			System.out.println("이미지 읽기 종료2");
//			end = System.currentTimeMillis();
//			double result = (double)(end - start) / 1000;
//			
//			System.out.println("소요 시간 : " + result + "초");
//			System.out.println("보조 스트림으로 읽기 종료");
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(bis != null) {
//					bis.close();
//				}
//				if(bisReadFile != null) {
//					bisReadFile.close();
//				}
//				if(readFile != null) {
//					readFile.close();
//				}
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-13 보조 스트림을 이용한 이미지 복사
//		
//		FileInputStream readFile = null; //기반 스트림
//		BufferedInputStream bis = null; //보조 스트림
//		
//		FileOutputStream writeFile = null; //기반 스트림
//		BufferedOutputStream bos = null; //보조 스트림
//		
//		try {
//			System.out.println("기본 스트림으로 복사 시작");
//			readFile = new FileInputStream("back.jpg");
//			writeFile = new FileOutputStream("copy.jpg");
//			//데이터 읽을 변수
//			int read = 0;
//			
//			//현재 시간을 m/s 단위로 나타냄
//			long start = System.currentTimeMillis();
//			System.out.println("이미지 복사 시작1");
//			while((read = readFile.read()) != -1) {
//				//이미지 쓰기
//				writeFile.write(read);
//			}
//			System.out.println("이미지 복사 종료1");
//			long end = System.currentTimeMillis();
//			long time = (end - start) / 1000;
//			
//			System.out.println("소요 시간 : " + time + "초");
//			System.out.println("기본 스트림으로 복사 종료");
//			
//			// 파일 닫기
//			readFile.close();
//			writeFile.close();
//			
//			System.out.println("보조 스트림으로 복사 시작");
//			
//			readFile = new FileInputStream("back.jpg");
//			writeFile = new FileOutputStream("copy.jpg");
//			
//			bis = new BufferedInputStream(readFile);
//			bos = new BufferedOutputStream(writeFile);
//			// 현재 시간을 m/s 단위로 나타냄
//			start = System.currentTimeMillis();
//			System.out.println("이미지 복사 시작2");
//			while(bis.read() != -1) {
//				//이미지 쓰기
//				bos.write(read);
//			}
//			
//			System.out.println("이미지 복사 종료2");
//			end = System.currentTimeMillis();
//			double result = (double)(end - start) / 1000;
//			
//			System.out.println("소요 시간 : " + result + "초");
//			System.out.println("보조 스트림으로 복사 종료");
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(bis != null) {
//					bis.close();
//				}
//				if(readFile != null) {
//					readFile.close();
//				}
//				if(bos != null) {
//					bos.close();
//				}
//				if(writeFile != null) {
//					writeFile.close();
//				}
//				
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-14 BufferedReader
//		
//		FileReader reader = null;
//		BufferedReader br = null;
//		
//		try {
//			reader = new FileReader("book.txt");
//			br = new BufferedReader(reader);
//			//문장을 저장할 변수
//			String str = "";
//			//버퍼에 문자를 저장하기 때문에 한번에 읽기 가능
//			while((str = br.readLine()) != null) {
//				System.out.println(str);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			
//			try {
//				if(br != null) {
//					br.close();
//				}
//				if(reader != null) {
//					reader.close();
//				}
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-15 BufferedWriter
//		
//		FileReader reader = null;
//		BufferedReader br = null;
//		FileWriter writer = null;
//		BufferedWriter bw = null;
//		
//		try {
//			
//			reader = new FileReader("book.txt");
//			writer = new FileWriter("book_copy.txt", false);
//			br = new BufferedReader(reader);
//			bw = new BufferedWriter(writer);
//			//문장을 저장할 변수
//			String str = "";
//			
//			System.out.println("텍스트 파일 복사 시작");
//			//reader를 통해 읽어 온 문장을 새로운 파일에 씁니다.
//			while((str = br.readLine()) != null) {
//				bw.write(str + "\n");
//			}
//			System.out.println("텍스트 파일 복사 완료");
//		} catch(Exception e) {
//			
//		} finally {
//			
//			try {
//				if(bw != null) {
//					bw.close();
//				}
//				if(writer != null) {
//					writer.close();
//				}
//				if(br != null) {
//					br.close();
//				}
//				if(reader != null) {
//					reader.close();
//				}
//			} catch(Exception e) {
//				
//			}
//		}

		// 예제 19-16 InputStreamReader
//		
//		FileInputStream in = null;
//		InputStreamReader is = null;
//		
//		try {
//			in = new FileInputStream("read.txt");
//			is = new InputStreamReader(in, "UTF-8");
//			int read = 0;
//			
//			while((read = is.read()) != -1) {
//				System.out.println((char)read);
//			}
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(is != null) {
//					is.close();
//				}
//				if(is != null) {
//					is.close();				//in이 아니고 is?
//				}
//			} catch(Exception  e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-17 OutputStreamWriter 예제
//		
//		FileOutputStream in = null;
//		OutputStreamWriter is = null;
//		
//		try {
//			in = new FileOutputStream("example.txt");
//			is = new OutputStreamWriter(in, "UTF-8");
//			System.out.println("파일 생성 시작");
//			String[] strArray = {"OutputStreamWriter에 대해 배웁니다.",
//								"we are learning about OutputStreamWriter"};
//			for(String str : strArray) {
//				is.write(str + "\n");
//			}
//			System.out.println("파일 생성 완료");
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(is != null) {
//					is.close();
//				}
//				if(is != null) {
//					is.close();
//				}
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}

		// 예제 19-18 File 기능

//		File f = new File(".../src/example.txt");
//		if(f.exists()) { //파일이 존재할 경우
//			
//			System.out.println("length : " + f.length()); //파일 크기 반환
//			System.out.println("conRead : " + f.canRead()); //읽기 가능한 파일 여부 반환
//			System.out.println("canWrite : " + f.canWrite());	//쓰기 가능한 파일 여부 반환
//			System.out.println("getAbsolutePath : " + f.getAbsolutePath());	//절대 경로 반환
//			
//			System.out.println("getName : " + f.getName()); 	 //파일 이름 반환
//			System.out.println("getParent : " + f.getParent());	//현재 파일 또는 폴더의 상위 폴더 반환 (없으면 null)
//			System.out.println("getPath : " + f.getPath()); 	//파일의 상대 경로를 반환
//		}else { //파일이 존재하지 않을 경우
//			System.out.println("파일이 존재하지 않습니다.");
//		}

		// 예제 19-19 Person class 생성

//		public class Person implements Serializable {
//			private static final long serialVersionUID = 1L;
//			
//			//필드
//			private String myName;
//			private int myAge;
//			
//			//setter
//			public Person(String myName, int myAge) {
//				this.setMyName(myName);
//				this.setMyAge(myAge);
//			}
//			
//			//생성자
//			public String getMyName() {
//				return myName;
//			}
//			
//			public void setMyName(String myName) {
//				this.myName = myName;
//			}
//			
//			public int getMyAge() {
//				return myAge;
//			}
//			
//			public void setMyAge(int myAge) {
//				this.myAge = myAge;
//			}
//			
//		}

		// 예제 19-20 객체 직렬화

//		public class ObjectSerialExample {
//			public static void main(String[] args) {
//				
//				//객체 생성
//				Person p1 = new Person("김철수", 19);
//				Person p2 = new Person("김영의", 17);
//				
//				FileOutputStream out = null;
//				ObjectOutputStream oos = null;
//				try {
//					
//					out = new FileOutputStream("object_data.dat");
//					oos = new ObjectOutputStream(out);
//					
//					oos.writeObject(p1);
//					oos.writeObject(p2);
//					
//				} catch(Exception e) {
//					e.printStackTrace();
//				} finally {
//					
//					try {
//						if(oos != null) {
//							oos.close();
//						}
//						
//						if(out != null) {
//							out.close();
//							
//						}
//					} catch(Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}

		// 예제 19-21 역직렬화
//		
//		FileInputStream in = null;
//		ObjectInputStream ois = null;
//		try {
//			in = new FileInputStream("object_data.dat");
//			ois = new ObjectInputStream(in);
//			
//			while(in.available() != 0) {
//				Person p = (Person)ois.readObject();
//				System.out.println("이름 : " + p.getMyName() + ", 나이 : " + p.getMyAge());
//			}
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(ois != null) {
//					ois.close();
//				}
//				
//				if(in != null) {
//					in.close();
//				}
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		// 출력 결과
		// 이름 : 김철수, 나이 : 19
		// 이름 : 김영희, 나이 : 17

	}
}
