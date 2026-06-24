# 🦁 멋쟁이사자처럼 한서대 14기 백엔드 26년 1학기 수업 코드

멋쟁이사자처럼 한서대학교 14기에서 **백엔드 팀장**을 맡아 2026년 1학기 동안 진행한 백엔드 수업 내용을 정리한 저장소입니다.

본 저장소는 수업에서 사용한 **실습 코드와 예제 프로젝트 코드**를 정리한 공간이며, 각 주차별 이론 자료와 실습 가이드는 Notion을 통해 함께 제공합니다.

---

## 📌 활동 개요

| 구분    | 내용                                                  |
| ----- | --------------------------------------------------- |
| 활동명   | 멋쟁이사자처럼 한서대 14기 백엔드 1학기 수업                          |
| 역할    | 백엔드 팀장                                              |
| 기간    | 2026년 1학기                                           |
| 대상    | 멋쟁이사자처럼 한서대 14기 백엔드 파트                              |
| 수업 구성 | 총 5주차                                               |
| 주요 내용 | 백엔드 기초 개념, API 설계, Spring Boot 실습, DB 연동, CRUD 구현 등 |

---

## 🧑‍🏫 수업 목적

이 수업은 백엔드를 처음 접하는 학생들이 웹 서비스의 서버 구조를 이해하고, 직접 API를 구현해보는 것을 목표로 진행되었습니다.

단순한 이론 설명보다는 실제 프로젝트에서 자주 사용하는 개념을 중심으로 구성하였고, 각 주차마다 실습 코드를 함께 작성하며 백엔드 개발 흐름을 익힐 수 있도록 진행했습니다.

---

## 📚 주차별 수업 자료

| 주차  | 주제                                    | 수업 자료                                                                                                                         |
| --- | ------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| 1주차 | 백엔드 기초 및 개발 환경 설정                     | [Notion 바로가기](https://www.notion.so/native/1-32c903023d6680509232c95252b36e2f?source=copy_link&deepLinkOpenNewTab=true)       |
| 2주차 | Spring Boot 기초 및 API 구조 이해            | [Notion 바로가기](https://www.notion.so/2-32c903023d6680a09ef5f8be24845130?source=copy_link)                                      |
| 3주차 | Controller, Service, Repository 구조 실습 | [Notion 바로가기](https://www.notion.so/3-32c903023d6680fdb97af2a42ccf9471?source=copy_link)                                      |
| 4주차 | 데이터베이스 연동 및 CRUD 구현                   | [Notion 바로가기](https://app.notion.com/p/4-32c903023d668012ad70dedb774fb750?source=copy_link&assetsVersion=23.13.20260615.0944) |
| 5주차 | 프론트엔드 연동 및 프로젝트 실습                    | [Notion 바로가기](https://app.notion.com/p/5-342903023d6680c1ba44d7c1fd0cd2f7?source=copy_link)                                   |

---

## 🗂️ 저장소 구성

## 🗂️ 코드 구조

```bash
SimpleMemo
├── .gradle
├── .idea
├── build
├── gradle
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── simplememo
│   │   │               ├── controller
│   │   │               │   ├── CommentController
│   │   │               │   └── MemoController
│   │   │               ├── dto
│   │   │               │   ├── CommentRequestDto
│   │   │               │   ├── CommentResponseDto
│   │   │               │   ├── MemoRequestDto
│   │   │               │   └── MemoResponseDto
│   │   │               ├── entity
│   │   │               │   ├── Comment
│   │   │               │   └── Memo
│   │   │               ├── repository
│   │   │               │   ├── CommentRepository
│   │   │               │   └── MemoRepository
│   │   │               ├── service
│   │   │               │   ├── CommentService
│   │   │               │   └── MemoService
│   │   │               ├── CommonResponse
│   │   │               └── SimpleMemoApplication
│   │   └── resources
│   │       ├── static
│   │       ├── templates
│   │       └── application.yml
│   └── test
├── .gitattributes
└── .gitignore
```

| 폴더 / 파일                 | 설명                              |
| ----------------------- | ------------------------------- |
| `controller`            | 클라이언트 요청을 받아 API 엔드포인트를 처리하는 계층 |
| `dto`                   | 요청 데이터와 응답 데이터를 전달하기 위한 객체      |
| `entity`                | 데이터베이스 테이블과 매핑되는 도메인 객체         |
| `repository`            | 데이터베이스 접근을 담당하는 계층              |
| `service`               | 비즈니스 로직을 처리하는 계층                |
| `CommonResponse`        | 공통 응답 형식을 관리하는 클래스              |
| `SimpleMemoApplication` | Spring Boot 애플리케이션 실행 파일        |
| `application.yml`       | 서버, DB, JPA 등 프로젝트 설정 파일        |

---

## 🛠️ 사용 기술

| 분야              | 기술              |
| --------------- | --------------- |
| Language        | Java            |
| Framework       | Spring Boot     |
| Database        | MySQL           |
| ORM             | Spring Data JPA |
| API Test        | Postman         |
| Version Control | Git, GitHub     |

---

## 💡 주요 학습 내용

* 백엔드 서버의 역할과 웹 서비스 동작 흐름 이해
* HTTP 요청과 응답 구조 학습
* REST API 설계 방식 학습
* Spring Boot 프로젝트 구조 이해
* Controller, Service, Repository 계층 분리
* MySQL 데이터베이스 연동
* JPA를 활용한 Entity 설계
* CRUD API 구현
* 프론트엔드와 백엔드 연동 방식 이해

---

## 📖 수업 진행 방식

각 주차는 다음과 같은 흐름으로 진행되었습니다.

```text
이론 설명 → 코드 실습 → API 테스트 → 오류 해결 → 복습 자료 제공
```

백엔드 개발을 처음 접하는 학생들도 따라올 수 있도록 개념을 먼저 설명한 뒤, 실제 코드를 작성하며 기능이 동작하는 과정을 확인하는 방식으로 수업을 구성했습니다.

---

## 🧩 예제 API

```http
GET /api/example
POST /api/example
PUT /api/example/{id}
DELETE /api/example/{id}
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
