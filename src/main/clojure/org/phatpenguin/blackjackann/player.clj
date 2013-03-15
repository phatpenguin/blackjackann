(ns org.phatpenguin.blackjackann.player
  (:require [org.phatpenguin.blackjackann.deck :as deck]
    [org.phatpenguin.blackjackann.strategy.ann :as ann-strategy]
    [org.phatpenguin.blackjackann.strategy.dealer :as dealer-strategy]))

(defrecord player [name dealer? hand chips bet games-won blackjacks strategy])

(def ann-player (player. "ann" false '() 1000000 10 0 0 ann-strategy/strategy))
(def dealer-player (player. "dealer" true '() 1000000 10 0 0 dealer-strategy/strategy))
