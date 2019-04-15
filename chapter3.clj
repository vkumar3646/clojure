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
