package Student;

public class SecondGrade implements ComputeGrade {
	private int score;
	
	@Override
	public void cGrade(int score) {
		this.score = score;
	}

	@Override
	public void pass() {
		if(score>=80) {
			System.out.println("통과입니다.");
		}else {
			System.out.println("조금 더 노력해봐요");
		}
		
	}

}
