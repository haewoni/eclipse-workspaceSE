
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("----학생데이타를 저장하기위한 배열객체생성 초기화---");
		int[] noArray= {1,2,3,4,5,6,7,8,9,10};
		String[] nameArray= {"KIM","LEE","PAR","CHO","SIM","GOO","PIM","MIN","AIM","LIM"};
		int[] kora= {34,56,12,89,91,67,88,93,67,99};
		int[] enga= {44,57,21,83,93,76,81,67,12,39};
		int[] matha= {90,56,34,67,23,88,99,78,55,80};
		
		int[] tota= {0,0,0,0,0,0,0,0,0,0};
		double[] avga= {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradea= new char[10];
		int[] ranka= {1,1,1,1,1,1,1,1,1,1};
		//총점,평균,평점
		for (int i = 0; i < noArray.length; i++) {
			tota[i]=kora[i]+enga[i]+matha[i];
			avga[i]=(double)tota[i]/3.0;
			if(avga[i]>=90) {
				gradea[i]='A';
			}else if(avga[i]>=80) {
				gradea[i]='B';
			}else if(avga[i]>=70) {
				gradea[i]='C';
			}else if(avga[i]>=60) {
				gradea[i]='D';
			}else {
				gradea[i]='F';
			}
			
		}
		System.out.println("Quiz:석차계산");
		/*****************************/
		for (int i = 0; i < tota.length; i++) {
			for (int j = 0; j < tota.length; j++) {
				if(tota[i] < tota[j]) {
					ranka[i] = ranka[i]+1;
					//ranka[i]++;
				}
			}
		}
		/*******************************/
		/*
		 * 학생번호는 중복되지않는다.
		 */
		System.out.println(">>> 3번학생찾아서 1명정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if(noArray[i]==3) {
				System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				           noArray[i],nameArray[i],kora[i],
				           enga[i],matha[i],tota[i],
				           avga[i],gradea[i],ranka[i]);
				break;
				
			}
		}
		System.out.println(">>> 학점이F인 학생들 찾아서 출력");
		for (int i = 0; i < gradea.length; i++) {
			if(gradea[i]=='F') {
				System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				           noArray[i],nameArray[i],kora[i],
				           enga[i],matha[i],tota[i],
				           avga[i],gradea[i],ranka[i]);
			}
		}
		System.out.println(">>>[Quiz]국어점수 70점이하인 학생들 찾아서 출력");
		
		
		System.out.println(">>> [Quiz]총점순 오름차순 정렬");
		/*
		 1회 
		 */
		for (int i = 0; i < tota.length-1; i++) {
			for(int j=0;j<tota.length-1;j++) {
				if(tota[j] > tota[j+1]) {
					//총점교환
					int tempTot=tota[j];
					tota[j]=tota[j+1];
					tota[j+1]=tempTot;
					//학번 교환
					int tempNo=noArray[j];
					noArray[j]=noArray[j+1];
					noArray[j+1]=tempNo;
					//이름 교환
					String tempName=nameArray[j];
					nameArray[j]=nameArray[j+1];
					nameArray[j+1]=tempName;
					//국어교환
					int tempKor = kora[j];
					kora[j]=kora[j+1];
					kora[j+1]=tempKor;
					//영어교환
					int tempEng = enga[j];
					enga[j]=enga[j+1];
					enga[j+1]=tempEng;
					//수학교환
					int tempMath = matha[j];
					matha[j]=matha[j+1];
					matha[j+1]=tempMath;
					//평균교환
					double tempAvg=avga[j];
					avga[j]=avga[j+1];
					avga[j+1]=tempAvg;
					
					//평점교환
					char tempGrade=gradea[j];
					gradea[j]=gradea[j+1];
					gradea[j+1]=tempGrade;
					//석차교환
					int tempRank=ranka[j];
					ranka[j]=ranka[j+1];
					ranka[j+1]=tempRank;
				}
			}
		}
		System.out.println(">>>[Quiz]총점순 내림차순 정렬");
		
		System.out.println("---------------학생 성적출력------------------");
		System.out.printf("%s %s %s %s %s %3s %s %s %s\n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
			           noArray[i],nameArray[i],kora[i],
			           enga[i],matha[i],tota[i],
			           avga[i],gradea[i],ranka[i]);
		}
		System.out.println("----------------------------------------------");
		
		
		
		
		
	}

}
