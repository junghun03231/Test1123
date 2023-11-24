## 1차 요구사항 구현
- [x] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [x] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [x] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [x] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [x] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [x] 게시글 상세 페이지에는 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)

## 미비사항 or 막힌 부분
- 등록할때 에러떠서 마지막 폼 객체 생성하는 건 책을 따라했다
  - 폼 생성 전에 에러뜨는 부분을 정확히 모르겠다

## MVC 패턴
- ...

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- 생성자 주입
- @autowired 주입
- setter 주입

## JPA의 장점과 단점
#### 장점
- SQL쿼리를 작성하지 않고도 객체를 통해 DB를 조작할 수 있다. 
- 가독성이 좋고, 유지보수가 쉽다.

#### 단점

- 복잡한 쿼리 처리가 힘들다.
- 특정 DB에 종속된다.
- 성능저하의 위험이 있다.