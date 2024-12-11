## 스프링이 지원하는 다양한 외부 설정 조회 방법
- `Environment` (`MyDataSourceEnvConfig`)
  - 단점: `Environment`를 직접 주입받고, `environment.getProperty(key)`를 통해서 값을 꺼내는 과정을 반복해야 한다는 점.
- `@Value` - 값 주입 (`MyDataSourceValueConfig`)
  - `@Value`도 내부적으로는 `Environment`를 사용하고 있음.
  - 단점: `@Value`로 하나하나 외부 설정 정보의 키 값을 입력받고, 주입 받아와야 하는 부분이 번거로움.
- `@ConfigurationProperties` - Type-safe 설정 속성