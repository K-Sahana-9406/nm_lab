object Main{
def main(args: Array[String]): Unit={
var n=10
println("decimal :"+n)
var pow =1
var ans=0
while(n>0){
var rem=n%2
ans+=(rem*pow)
pow*=10
n=n/2
}
println("Binary :"+ans);
}}

