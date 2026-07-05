# 🦁 멋쟁이사자처럼 한서대 14기 백엔드 26년 1학기 수업 코드

멋쟁이사자처럼 한서대학교 14기에서 **백엔드 팀장**을 맡아 2026년 1학기 동안 진행한 백엔드 수업 내용을 정리한 저장소입니다.

본 저장소는 수업에서 사용한 **Java 기초 실습 코드와 SimpleMemo Spring Boot 예제 프로젝트 코드**를 정리한 공간이며, 각 주차별 이론 자료와 실습 가이드는 Notion을 통해 함께 제공합니다.

---

## 📌 활동 개요

| 구분    | 내용                                                  |
| ----- | --------------------------------------------------- |
| 활동명   | 멋쟁이사자처럼 한서대 14기 백엔드 1학기 수업                          |
| 역할    | 백엔드 팀장                                              |
| 기간    | 2026년 1학기                                           |
| 대상    | 멋쟁이사자처럼 한서대 14기 백엔드 파트                              |
| 수업 구성 | 총 5주차                                               |

---

## 🧑‍🏫 수업 목적

<table>
  <tr>
    <td align="center">
      <img 
        src="https://github.com/user-attachments/assets/9dc0f8a4-0013-439b-98f1-ac2943677d3e"
        alt="프로젝트 이미지" 
        width="100%"
      />
    </td>
  </tr>
</table>

<br />

이 수업은 백엔드를 처음 접하는 학생들이 웹 서비스의 서버 구조를 이해하고, 직접 API를 구현해보는 것을 목표로 진행되었습니다.

단순한 이론 설명보다는 실제 프로젝트에서 자주 사용하는 개념을 중심으로 구성하였고, 각 주차마다 실습 코드를 함께 작성하며 백엔드 개발 흐름을 익힐 수 있도록 진행했습니다.

---

## 📚 주차별 수업 자료

<table>
  <tr>
    <td align="center">
      <img 
        src="https://github.com/user-attachments/assets/1ce13041-bb6a-4c61-9437-926247fa5de2"
        alt="프로젝트 이미지" 
        width="100%"
      />
    </td>
  </tr>
</table>

<br />

| 수업자료 | [Notion 바로가기](https://app.notion.com/p/14-32c903023d6680eeb55ef245e2c594ff?source=copy_link) |

---

## 🗂️ 코드 구조

```bash
SimpleMemo
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── src
│   ├── HelloWorld.java
│   ├── DataType.java
│   ├── Condition.java
│   ├── Loop.java
│   ├── Array.java
│   ├── Input.java
│   ├── BabyLion.java
│   ├── package1
│   │   ├── Lion.java
│   │   ├── Step1.java
│   │   └── Step2.java
│   ├── package2
│   │   └── Step3.java
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── simplememo
│   │   │               ├── controller
│   │   │               │   ├── CommentController.java
│   │   │               │   └── MemoController.java
│   │   │               ├── dto
│   │   │               │   ├── CommentRequestDto.java
│   │   │               │   ├── CommentResponseDto.java
│   │   │               │   ├── MemoRequestDto.java
│   │   │               │   └── MemoResponseDto.java
│   │   │               ├── entity
│   │   │               │   ├── Comment.java
│   │   │               │   └── Memo.java
│   │   │               ├── repository
│   │   │               │   ├── CommentRepository.java
│   │   │               │   └── MemoRepository.java
│   │   │               ├── service
│   │   │               │   ├── CommentService.java
│   │   │               │   └── MemoService.java
│   │   │               ├── CommonResponse.java
│   │   │               └── SimpleMemoApplication.java
│   │   └── resources
│   │       └── application.yml
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── simplememo
│                       └── SimpleMemoApplicationTests.java
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── .gitattributes
└── .gitignore
```

| 폴더 / 파일                 | 설명                                        |
| ----------------------- | ----------------------------------------- |
| `src/*.java`            | Java 기초 문법 실습 코드                          |
| `src/package1`          | 클래스, 생성자, 객체 생성, 검증 메서드 실습 코드              |
| `src/package2`          | 패키지와 접근 제어자 실습 코드                         |
| `controller`            | 클라이언트 요청을 받아 Memo, Comment API 엔드포인트를 처리하는 계층 |
| `dto`                   | 요청 데이터와 응답 데이터를 전달하기 위한 객체                |
| `entity`                | 데이터베이스 테이블과 매핑되는 Memo, Comment 도메인 객체      |
| `repository`            | Spring Data JPA 기반 데이터베이스 접근 계층            |
| `service`               | 메모와 댓글의 생성, 조회, 수정, 삭제 비즈니스 로직 처리 계층      |
| `CommonResponse`        | `statusCode`, `msg`, `data`를 담는 공통 응답 클래스 |
| `SimpleMemoApplication` | Spring Boot 애플리케이션 실행 파일                  |
| `application.yml`       | 서버, MySQL, JPA 등 프로젝트 설정 파일               |
| `build.gradle`          | 프로젝트 의존성과 Java 버전, Spring Boot 설정 파일       |

---

## ✅ 주요 구현 기능

* 메모 생성
* 메모 단건 조회
* 메모 전체 조회
* 메모 수정
* 메모 삭제
* 특정 메모에 댓글 작성
* 특정 메모의 댓글 목록 조회
* 댓글 수정
* 댓글 삭제
* `Memo`와 `Comment`의 1:N 연관관계 구성
* `CommonResponse<T>`를 활용한 공통 응답 형식 구성

---

## 🛠️ 사용 기술

| 분야              | 기술                                  |
| --------------- | ----------------------------------- |
| Language        | Java 17                             |
| Framework       | Spring Boot 4.0.5                   |
| Build Tool      | Gradle Wrapper 9.4.1                |
| Web             | Spring Web MVC                      |
| Database        | MySQL                               |
| ORM / DB Access | Spring Data JPA, Spring Data JDBC, JDBC |
| Library         | Lombok                              |
| API Test        | Postman                             |
| Version Control | Git, GitHub                         |

---

## ⚙️ 프로젝트 설정

`application.yml` 기준 프로젝트 실행 설정은 다음과 같습니다.

| 항목       | 설정값                                      |
| -------- | ---------------------------------------- |
| Server Port | `8080`                                  |
| Database URL | `jdbc:mysql://localhost:3306/likelionstudy` |
| Database User | `root`                                |
| JPA DDL Auto | `create`                              |
| SQL Log | `show_sql`, `format_sql`, `use_sql_comments` |

---

## 💡 주요 학습 내용

* Java 기본 출력, 자료형, 조건문, 반복문, 배열, 입력 처리 실습
* 클래스, 객체 생성, 생성자, 메서드, 접근 제어자 이해
* 백엔드 서버의 역할과 웹 서비스 동작 흐름 이해
* HTTP 요청과 응답 구조 학습
* REST API 설계 방식 학습
* Spring Boot 프로젝트 구조 이해
* Controller, Service, Repository 계층 분리
* MySQL 데이터베이스 연동
* JPA를 활용한 Entity 설계
* Memo, Comment CRUD API 구현
* 프론트엔드와 백엔드 연동 방식 이해

---

## 📖 수업 진행 방식

각 주차는 다음과 같은 흐름으로 진행되었습니다.

```text
수업자료 공유 → 이론 설명 → 코드 실습 → API 테스트 → 오류 해결
```

백엔드 개발을 처음 접하는 학생들도 따라올 수 있도록 개념을 먼저 설명한 뒤, 실제 코드를 작성하며 기능이 동작하는 과정을 확인하는 방식으로 수업을 구성했습니다.

---

## 🧩 예제 API

### Memo API

| Method | Endpoint             | 기능       | Request Body |
| ------ | -------------------- | ---------- | ------------ |
| `POST` | `/api/memo`          | 메모 생성   | `title`, `content` |
| `GET`  | `/api/memo`          | 메모 전체 조회 | - |
| `GET`  | `/api/memo/{memoId}` | 메모 단건 조회 | - |
| `PUT`  | `/api/memo/{memoId}` | 메모 수정   | `title`, `content` |
| `DELETE` | `/api/memo/{memoId}` | 메모 삭제 | - |

### Comment API

| Method | Endpoint                         | 기능              | Request Body |
| ------ | -------------------------------- | ----------------- | ------------ |
| `POST` | `/api/memo/comments/{memoId}`    | 특정 메모에 댓글 생성 | `content` |
| `GET`  | `/api/memo/comments/{memoId}`    | 특정 메모의 댓글 조회 | - |
| `PUT`  | `/api/memo/comments/{commentId}` | 댓글 수정          | `content` |
| `DELETE` | `/api/memo/comments/{commentId}` | 댓글 삭제        | - |

### 공통 응답 형식

```json
{
  "statusCode": 200,
  "msg": "응답 메시지",
  "data": {}
}
```

각 주차별 상세 API와 실습 내용은 Notion 수업 자료에서 확인할 수 있습니다.

---

## 🏆 수업을 통해 얻은 경험

백엔드 팀장으로서 단순히 코드를 작성하는 것뿐만 아니라, 백엔드 개념을 처음 배우는 팀원들이 이해하기 쉬운 방식으로 수업 자료를 구성하고 실습을 진행했습니다.

또한 수업 중 발생하는 오류를 함께 해결하며 개발 환경 설정, API 테스트, 데이터베이스 연동 과정에서 자주 발생하는 문제들을 정리하고 공유했습니다.

---

## 📌 회고

이번 수업을 통해 백엔드 개발 지식을 전달하는 과정에서 개념을 명확하게 설명하는 능력과 실습 중심의 자료 구성 능력을 기를 수 있었습니다.

특히 팀원들이 직접 API를 구현하고 테스트할 수 있도록 수업을 구성하면서, 협업과 교육 측면에서 백엔드 팀장의 역할을 경험할 수 있었습니다.
