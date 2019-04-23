;2. Write a function that takes a number and adds 100 to it.
(defn add-hundred 
  "Adds 100 to a number"
  [num] 
  (+ num 100))
  
;3. Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction:
(defn dec-maker
"Create a custom decrementor"
[dec-by]
#(- % dec-by))
  
  (def dec9 (dec-maker 9))
  (dec9 10)

;4. Write a function, mapset, that works like map except the return value is a set:
;(mapset inc [1 1 2 2])
;; => #{2 3}
(defn mapset [f l]
  (into #{} (map f l)))
