# MusicOTLanguage
OTLanguage를 이용해서 만드는 음악 프로그램

![](https://velog.velcdn.com/images/persestitan/post/678a1c11-0214-4aed-8c18-e1704f3aaae3/image.png)

# 안내
OTLanguage를 이용하여 음악을 만들 수 있게 되었습니다 !!

공식 확장자는 .otlm이지만 .otl확장자도 허용합니다.

간단한 음악정도 밖에 못 만든다는 한계가 존재하지만 재미로 한번쯤 만들어보는 것도 나쁘지 않을 것 같네요...ㅎㅎ

# 사용법

### 각 음표

- ㅇ도ㅇ : 도
- ㅇ레ㅇ : 레
- ㅇ미ㅇ : 미
- ㅇ파ㅇ : 파
- ㅇ솔ㅇ : 솔
- ㅇ라ㅇ : 라
- ㅇ시ㅇ : 시
- ㅇ드ㅇ : 드럼1
- ㅇ드드ㅇ : 드럼2
- ㅇ드드드ㅇ : 드럼3
- ㅇ드드드드ㅇ : 드럼4

### 규칙
한 줄에 사용한 음은 동시에 작동합니다.
해당 코드는 '도'와 '레'가 동시에 동작합니다.
```otl
ㅇ도ㅇ ㅇ레ㅇ
```

한줄에 1박자입니다. (Ver 1.0 버전 기준 : 1박자 1초)
단, 변수 선언부분은 생략됩니다.
Tip : 따라서 공백은 1박자 쉬는 걸로 작동됩니다.
해당 코드는 도 -> 소리 없음 -> 레 와 같은 소리가 들립니다.
```otl
ㅇ도ㅇ

ㅇ레ㅇ
```


### 변수

'ㅇMㅇ' 는 원래 변수이지만 'ㅇ음ㅇ'또한 허용합니다.
음악 코드를 변수처럼 사용이 가능합니다.

선언= ㅇMㅇ [변수명]:[음원]
사용= :[변수명]

예시
```otl
코드
ㅇ음ㅇ ㅇㅇ:ㅇ도ㅇ ㅇ레ㅇ
:ㅇㅇ :ㅇㅇ

동작
ㅇ도ㅇ ㅇ레ㅇ ㅇ도ㅇ ㅇ레ㅇ
```

### 전체 코드 예시
예시
```otl
ㅇ음ㅇ 도:ㅇ도ㅇ
ㅇMㅇ 레:ㅇ레ㅇ

도 레
도 도

도 레 ㅇ미ㅇ
ㅇ드ㅇ
ㅇ드드ㅇ
```

---

- [블로그 링크](https://velog.io/@persestitan/OTLanguage-%EC%9D%8C%EC%95%85-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-Ver-1.0)
- [Mac 다운로드 링크 (.pkg)](https://github.com/OTLanguage/MusicOTLanguage/raw/master/Version/Ver%201.0/Mac/OTLanguageMusic-1.0.pkg)
- [Window 다운로드 링크 (.exe)](https://github.com/OTLanguage/MusicOTLanguage/raw/master/Version/Ver%201.0/Window/OTLanguageMusic.exe)
