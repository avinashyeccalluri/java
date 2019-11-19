for(int i=atlast.length-1;i>0;i--){
                int largest=0;
                for(int j=1;j<=i;j++){
                    if(atlast[i]<atlast[largest]){
                        largest=i;
                    }                    
                }
                int temp=atlast[largest];
                atlast[largest]=atlast[i];
                atlast[i]=temp;
            }
            StringBuilder strNum=new StringBuilder();
            for(int i:atlast)
            {
                strNum.append(i);
            }
            return Integer.parseInt(strNum.toString());