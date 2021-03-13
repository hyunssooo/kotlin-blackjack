# 블랙잭 🃏

## 기능 요구사항

- [ ] 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
  - [x] 각 카드에는 `suit`, `denomination` 이 있다. 
    - [x] `suit` 에는 heart, club, diamond, spade 가 있다.
    - [x] `denomination` 에는 ACE, 2 ~ 10, Jack, Queen, King 이 있다.
        - [x] Ace 1점 or 11점
        - [x] Jack, Queen, King 10점, 나머지는 각각 숫자가 점수
          - [x] 점수는 0점보다는 커야한다. 
- [ ] 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.
