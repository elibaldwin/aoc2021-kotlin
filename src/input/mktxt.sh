
for i in $(seq -f "%02g" 1 25)
do
  touch "$i.txt"
  touch "${i}_test.txt"
done