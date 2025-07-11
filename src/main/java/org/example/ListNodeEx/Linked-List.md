## 🔹 1. Co to jest Linked List?
**Linked List (lista jednokierunkowa)** to struktura danych składająca się z węzłów (ang. nodes), gdzie każdy węzeł przechowuje: 
 - jakąś wartość (`val`), 
 - wskaźnik na kolejny węzeł (`next`).

Czyli każdy element "wie", gdzie znajduje się następny.


`ListNode` to pojedynczy element listy z wartością i wskaźnikiem next.
Cała lista to po prostu ListNode `head`, a reszta elementów jest osiągana przez `.next`.
Po liście porusza się za pomocą pętli `while`.

## Analiza metody `addNumbers`
### ⏱️ Złożoność obliczeniowa (czasowa)
```java
while (head1 != null || head2 != null)
```
### Oznaczenia:
 - **n** – długość listy `head1` 
 - **m** – długość listy `head2`

###  Analiza:
 - Pętla wykonuje się maksymalnie **max(n, m)** razy. 
 - W każdej iteracji wykonuje się:
   - jedno dodawanie, 
   - jeden `new ListNode(sum % 10)`, 
   - przypisania `tail.next = ...`, `tail = tail.next` 
   - przesunięcia `head1 = head1.next` itd.

### 📌 Złożoność czasowa:
```
O(max(n, m))
```

### 🧠 Złożoność pamięciowa (space complexity)
### Analiza:
Tworzona jest nowa lista wynikowa, której długość to co najwyżej `max(n, m) + 1` (dodatkowy element, jeśli zostaje carry).

### 📌 Złożoność pamięciowa:
```
O(max(n, m))
```
— na strukturę wyjściową.

Brak alokacji dodatkowych tablic, brak rekurencji = brak ukrytych kosztów.

## ✅ Zalety implementacji
💡 wysoka czytelność

📈 bardzo dobra skalowalność — metoda powinna działać dobrze dla bardzo długich list

📦 Brak modyfikacji danych wejściowych - tworzy nową listę wynikową

♻️ Można użyć do testów jednostkowych - czysta funkcja, bez I/O

