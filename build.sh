#!/bin/bash
idl_dir=${IDL_DIR:=../service-idl}
output_dir=src
mkdir $output_dir
files=$(find $idl_dir -type f -name '*.proto')
if [ $? != 0 ];then
  exit 1
fi
for file in $files
do
  google_file=$idl_dir/google
  if [[ ! $file =~ ^"$google_file".* ]]; then
    protoc --java_out=$output_dir --grpc-java_out=$output_dir -I $idl_dir $file
    if [ $? != 0 ];then
      exit 2
    fi
  fi
done