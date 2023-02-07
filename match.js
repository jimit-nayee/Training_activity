function math(){
     n1 = document.getElementById("name1").value;
     s1 = document.getElementById("score1").value;
     n2 = document.getElementById("name2").value;
     s2 = document.getElementById("score2").value;

     sc1 = s1.split("/");
     sc2 = s2.split("/");
    
     if(s1=='' || s2=='' || n1=='' || n2==''){
        alert('enter the value');
     }
     if(n1==n2)
     {
        alert('name must be diffrent');
     }
      if(sc1[1]>=10 || sc2[1]>=10)
     {
        alert('Wickets must be below 10')

    }
    else{

     if(sc1[0]>sc2[0]){
        alert(n1 + 'won the match');
     }
     
     else if(sc1[0] == sc2[0])
     {
        alert('match is tied');
     }
     else
     {
        alert(n2+ 'won the match ');
     }
}
}