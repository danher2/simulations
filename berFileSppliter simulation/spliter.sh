daySplit=20
numberLines=`cat index.txt | wc -l`
DATA_DIR=/home/daniel/Documents

splitlinecount=$(($numberLines/$daySplit))
echo "Printing splitlinecount " $splitlinecount

splitlinecountMod=$(($numberLines%$daySplit))
echo "Printing splitlinecountMod " $splitlinecountMod

if [ $splitlinecountMod -gt 0 ]
echo "condition is true?"
echo "Printing exit status 0=succesful 1=unsuccessfull = "$?
then
splitlinecount=`expr $splitlinecount + 1`
echo "After expr splitlinecount + 1 = " $splitlinecount
fi

j=1
while [ $j -le 20 ]
do
split -d -l $splitlinecount index.txt spliterIndex
j=`expr $j + 1`
done

#The below will split the files for a server in to day files.
#k respresents Days Split and Z represents terminal order

for k in 00 01 02 03 04 05 06 07 08 09
    do
       mv $DATA_DIR/spliterIndex$k $DATA_DIR/location1
    done


for l in 10 11 12 13 14 15 16 17 18 19
    do
    mv $DATA_DIR/spliterIndex$l $DATA_DIR/location2   
    done

#rm spliterIndex*
