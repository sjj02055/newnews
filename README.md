# NEWNEWS

사용자가 시청한 뉴스에 대한 일련의 사건들을 놓치지 않도록 도와주는 서비스

<br>
<br>

## 서비스 배경

혹시 평소에 궁금했던 뉴스에 대한 후속 뉴스를 보았던 경험이 있나요?

평소에 뉴스에 관심없이 지내다 보면 세상이 어떻게 흘러가는지, 다른 사람이 무엇을 이야기 하는지 모를 때가 종종있습니다.

특히, 선거철에는 굉장히 많은 후속 뉴스들이 발생합니다. 

이러한 정보들을 손쉽게 파악하고자 ”NEWNEWS”를 서비스하게 되었습니다.

<br>
<br>

# 주요기능

### 시청한 뉴스 기반 후속보도 알림

- 사용자가 시청한 뉴스기록 저장
- 관련뉴스가 보도될 시 이를 사용자에게 알려줌

### 키워드와 관련된 일대기

- 사용자가 검색한 키워드에 해당하는 뉴스들을 큼지막한 주제를 기준으로 묶어 일대기 형식으로 보여줌

### 기대효과

- 시청한 뉴스에 대한 정보를 놓치지 않고 확인 가능
- 하나의 사건에 대해 쉽게 흐름 파악
- 왜곡된 정보흐름 차단

<br>
<br>

# 화면

### 로그인/회원가입

- 실시간 validation check
- 수정 필요한 입력에 대한 시각적인 표시 제공

### 연관뉴스

- 사용자가 시청한 뉴스와 연관된 뉴스를 모아서 보여줌

### 뉴스

- 뉴스를 최신순으로 보여줌
- 원하는 카테고리를 선택하여 추천받을 수 있음

### 성향분석(마이페이지)

- 봤던 뉴스의 카테고리 기반으로 성향 분석해줌

<br>
<br>

# ✨ Co-work tool ✨

<div align="center">
<img src="https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=Jira Software&logoColor=white">
<img src="https://img.shields.io/badge/Mattermost-0058CC?style=for-the-badge&logo=Mattermost&logoColor=white">
<br>
<img src="https://img.shields.io/badge/GitLab-FC6D26?style=for-the-badge&logo=GitLab&logoColor=white">
<img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=Figma&logoColor=white">
<img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white">
<img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white">
</div>

<br>

## 🖥 개발환경

- 형상관리 : Gitlab
- 이슈관리 : Jira
- 커뮤니케이션 : Mattermost, Notion
- 디자인 : Figma

### 🛠 기타 편의 툴

- Postman
- Termius

<br>

# ✨ Back End Stack ✨

<div align="center">
<img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white">
<img src="https://img.shields.io/badge/linux-yellow?style=for-the-badge&logo=linux&logoColor=black">
<img src="https://img.shields.io/badge/docker-2481D4?style=for-the-badge&logo=docker&logoColor=white">
<img src="https://img.shields.io/badge/ubuntu-D24939?style=for-the-badge&logo=ubuntu&logoColor=white">
<img src="https://img.shields.io/badge/jenkins-D33832?style=for-the-badge&logo=jenkins&logoColor=black">
<br>
<img src="https://img.shields.io/badge/FASTAPI-009688?style=for-the-badge&logo=FASTAPI&logoColor=white">
<img src="https://img.shields.io/badge/Amazon EC2-FF9900?style=for-the-badge&logo=Amazon EC2&logoColor=black">
<img src="https://img.shields.io/badge/Amazon AWS-FF9900?style=for-the-badge&logo=Amazon AWS&logoColor=black">
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white">
<br>
<img src="https://img.shields.io/badge/Spring Security-6DB33F?style=for-the-badge&logo=Spring Security&logoColor=white">
<img src="https://img.shields.io/badge/Let's Encrypt-003A70?style=for-the-badge&logo=Let's Encrypt&logoColor=white">
<img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white">
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">
</div>

<br>

- IDE : Intellij IDEA `2020.3`
- language : Java openjdk `11.0.15 2022-04-19 LTS`
- Springboot `2.7.9`
    - devtools
    - Spring Data JPA
    - Lombok
    - Spring Security
    - Spring Web
- Gradle `7.6.1`

## 📚 DB

- Mysql `8.0.32-0ubuntu0.20.04.2`

## 🛰 Server

- https `TLS 1.0`
- Ubuntu `20.0.4`
- Nginx `1.18.0`
- Docker `20.10.23`
- Jenkins `Jenkins/jenkins:lts-jdk11`(Image tag name)

<br>
<br>

# 프로젝트 성과

## 배운 점
- News 테이블을 5개의 테이블로 분할하여 DB의 비정규화를 경험해볼 수 있었습니다.
- JPA 연관관계 설정 뿐만 아니라 성능 이슈인 N+1을 해결해볼 수 있었습니다.
- JPQL쿼리 뿐만 아니라 Native 쿼리도 직접 작성해보며 join에 대한 경험을 해볼 수 있었습니다.
- TDD를 통한 개발을 하여 기능 오류를 줄일 수 있었습니다.
## 부족한 점
- 리팩토링 기간이 부족하여 비효율을 감수했습니다.
- 팀원과 협업 수단인 swagger를 적용하지 못했어요.



# 💻 시스템 아키텍쳐

<div width="100%">
  <img src="https://drive.google.com/uc?export=download&id=1w3LBLmOWxpX-uv9vILwE8GO1wE9I4zO_" width="100%">
</div>

<br>

<br>

# 🔊 요구사항 정의 및 기능 명세

<div width="100%">
  <img src="https://drive.google.com/uc?export=view&id=1Sh11y8rjgrx8kP9goGr4_Bx8PQepGtsy" width="100%">
</div>

[요구사항 정의 및 명세](https://ivory-market-839.notion.site/REST-API-ed23506dcb4c4d708e7bf235cf97fa0b)

<br>
<br>

# 📺 화면 설계서

<div width="100%">
  <img src="https://drive.google.com/uc?export=view&id=1GFQJbUky8lXgF2kQQazARHTaN6RSL-di" width="100%">
</div>

[화면 설계서](https://www.figma.com/file/m6xgbxq3CsazugNfm92zDC/News_pjt?node-id=0%3A1&t=jxMqx12yxiNNHHBz-1)

<br>
<br>

# 🦖 ER Diagram

<div width="100%">
  <img src="https://drive.google.com/uc?export=view&id=1ry1M5-B62D_1AKB0DSvGPDixvURlE-B7" width="100%">
</div>

[ER Diagram](https://www.erdcloud.com/d/xtL5NYsYb5aaKLXFM)
---

<br>
<br>

## 🍀 NEWNEWS 팀의 개발자들을 소개합니다!!

| 박진성     | 이기용   | 이성복   | 왕현석  | 박종호  | 곽승엽  |
| ---------- | ---------- | ---------- | --------- | --------- | ------- |
| <img src="https://drive.google.com/uc?export=view&id=1Ra15FntprFzCG3Qj8W5EKPLo7Zp9XyhL" width="100"> | <img src="https://drive.google.com/uc?export=view&id=1_rJb34sLDMXUvDyNCtEZXycO1Mpkh4QX" width="100">  | <img src="https://drive.google.com/uc?export=view&id=1g4QdVInpdGzcVhGxD9lrdm4CB1y9b6Xr" width="100"> | <img src="https://drive.google.com/uc?export=view&id=1WV5tVuSbRtEhBI99eBzs1F2dxNACZ7Fl" width="100"> | <img src="https://drive.google.com/uc?export=view&id=149FLkXqQrkuhtZQBfW9uZmU3Q8Kswkhq" width="100">  | <img src="https://drive.google.com/uc?export=view&id=1Z_hj41miFy3Z9c84pZOJu6UfPri2wUn2" width="100">  |
| Leader & FrontEnd | Frontend | Backend | Backend | Data Engineer | Data Engineer |