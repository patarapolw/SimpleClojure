(require '[clj-http.client :as client])
(use 'hickory.core)
(require '[hickory.select :as s])
(println 
    (-> (s/select (s/child (s/tag :title))
        (-> (client/get "https://learnxinyminutes.com/docs/smalltalk/")
            :body parse as-hickory)) first :content first)
)