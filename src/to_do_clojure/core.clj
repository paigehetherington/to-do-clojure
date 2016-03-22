(ns to-do-clojure.core
  (:gen-class))

(def todos (atom [])) ; holds the todos

(defn -main []
  (println "Type a to-do and hit enter. Type q to quit.")
  (loop []
    (let [text (read-line)]
      (when (not= text "q")
        (reset! todos (conj @todos text))
        (recur))))
  (println @todos))        


    
      
        
  
  

