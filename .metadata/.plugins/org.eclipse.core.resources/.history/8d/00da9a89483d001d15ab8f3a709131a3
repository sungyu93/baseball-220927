# MyBatis DB연결 세팅

### 설정방법
- MyBatisConfig 파일 필요
- resources/mapper/*.xml 파일 필요

### 의존성
- Spring Boot DevTools
- Lombok
- Validation
- MyBatis Framwork
- MariaDB Driver
- Spring Web
- Jstl
- Tomcat-embed-jasper

### 주말에 변경할 목록
- DB에 포지션, 퇴출사유 테이블 따로 만들기
- Controller 구현해서 view  뿌리기
- DTO 제대로 정리해서 올리기

### RestController를 이용한 결과값
![image](https://user-images.githubusercontent.com/108706329/191903098-382ad56b-165e-4a9e-8af0-e398dcdd5a1e.png)
![image](https://user-images.githubusercontent.com/108706329/191903496-f0cb8b69-d2c1-4304-81e0-598651d623d1.png)

- 주말에 Controller 만들기

### MariaDB 사용자 생성 및 권한 주기
```sql
CREATE USER 'bsa'@'%' IDENTIFIED BY 'bsa1234';
CREATE DATABASE baseballdb;
GRANT ALL PRIVILEGES ON baseballdb.* TO 'bsa'@'%';
```

### 테이블 생성
```sql
USE baseballdb;

DROP TABLE player;
create TABLE player(
    id int primary key auto_increment,
    playername varchar(20),
	 position VARCHAR(20),
    teamId int,
    createDate TIMESTAMP
);

DROP TABLE stadium;
create TABLE stadium(
    id int primary key auto_increment,
    stadiumname varchar(20),
    createDate TIMESTAMP
);

DROP TABLE team;
create TABLE team(
    id int primary key auto_increment,
    teamname varchar(20) UNIQUE,
    stadiumId int,
	 createDate TIMESTAMP
);

DROP TABLE expulsion;
create TABLE expulsion(
    id int primary KEY auto_increment,
    playersId int,
    stadiumId int,
	 reasons varchar(20),
    createDate TIMESTAMP
);


SELECT * FROM player;
SELECT * FROM stadium;
SELECT * FROM team;
SELECT * FROM expulsion;
COMMIT;
```

### 더미데이터 추가
```sql
INSERT INTO player(playername, POSITION, teamId, createDate) VALUES ('양현종', '투수', 1, NOW());
INSERT INTO player(playername, POSITION, teamId, createDate) VALUES ('김선빈', '내야수', 1, NOW());
INSERT INTO player(playername, POSITION, teamId, createDate) VALUES ('나성범', '외야수', 1, NOW());
INSERT INTO player(playername, POSITION, teamId, createDate) VALUES ('임창용', '투수', 1, NOW());
COMMIT;
```

### 상세보기 쿼리
```sql
SELECT s.stadiumname, t.teamname, s.createDate
FROM team t LEFT OUTER JOIN stadium s
ON t.stadiumId = s.id;

SELECT p.playername, t.teamname, p.POSITION, p.createDate
FROM player p
LEFT OUTER JOIN team t ON p.teamId = t.id;

SELECT p.playername, s.stadiumname, e.reason, e.createDate
FROM expulsion e
LEFT OUTER JOIN player p ON p.id = e.playersId
LEFT OUTER JOIN stadium s ON p.teamId = s.id;
```