(ns org.phatpenguin.blackjackann.deck)

(defrecord card [suit rank showing?])
(defrecord rank [name value])
(def deck-size 52)
(def deck-indexes (take deck-size (iterate inc 1)))
(def ranks {:A (->rank "Ace" [1 11])
            :2 (->rank "Two" 2)
            :3 (->rank "Three" 3)
            :4 (->rank "Four" 4)
            :5 (->rank "Five:" 5)
            :6 (->rank "Six" 6)
            :7 (->rank "Seven" 7)
            :8 (->rank "Eight" 8)
            :9 (->rank "Nine" 9)
            :10 (->rank "Ten" 10)
            :J (->rank "Jack" 10)
            :Q (->rank "Queen" 10)
            :K (->rank "King" 10)})
(def suits ["Hearts" "Diamonds" "Spades" "Clubs"])

(defn deck []
  (for [suit suits rank ranks]
         (->card suit rank false)))