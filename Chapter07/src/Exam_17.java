/*
 * MVC 패턴
 * M = Model => DTO (data transfer object), VO(value object), Java Bean
 * V = View => Console, 웹 => 브라우저 HTML, CSS, Javascript
 * C = Controller => 중재자 역할
 * 
 * MVC Model 1
 * JSP HTML과 JAVA 코드를 함께 작성할 수 있는 형태
 * - 프론트엔드(HTML, CSS, JS) / 백엔드(JAVA) => 같은 파일을 둘이서?
 * - 코드의 명확히 구분되어있지않고 복잡하다
 * 
 * MVC Model 2
 * View Request => Controller => Service => Repository(DAO) => SQL => DB
 * DB => (Model) Repository(DAO) => Service(Transaction) => Controller => View   
 * */
public class Exam_17 {

}
