package app;
/*
 *  제약조건(constraint)
               제약조건(constraint)이란 데이터의 무결성을 지키기 위해, 데이터를 입력받을 때 
               실행되는 검사 규칙을 의미합니다.
               이러한 제약 조건은 CREATE 문으로 테이블을 생성할 때나 ALTER 문으로 필드를 
               추가할 때도 설정할 수도 있습니다.
               -MySQL에서 사용할 수 있는 제약 조건은 다음과 같습니다.
               1. NOT NULL
               2. UNIQUE
               3. PRIMARY KEY
               4. FOREIGN KEY
               5. DEFAULT
              
          - NOT NULL
          
           NOT NULL 제약 조건을 설정하면, 해당 필드는 NULL 값을 저장할 수 없습니다.
           즉, 이 제약 조건이 설정된 필드는 무조건 데이터를 가지고 있어야 합니다.
           NOT NULL 제약 조건은 CREATE문으로 테이블을 생성할 때나,
           나중에 ALTER 문으로 추가할 수도 있습니다.
           
           ex1) [테이블 생성]
           CREATE TABLE TEST1(
           ID VARCHAR(10) NOT NULL,
           PW VARCHAR(30),
           NAME VARCHAR(30),
           MDate DATE,   날짜 정보를 저장할때 쓰는 코드
           AGE INT(3)
           );
   
 */
// ex1) 테이블 생성
public class Ex {

}
